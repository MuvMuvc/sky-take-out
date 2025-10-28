package com.sky.controller.admin;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.properties.JwtProperties;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "分类管理")
@RestController
@RequestMapping("/admin/category")
@Slf4j
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private JwtProperties jwtProperties;

    /**
     * 新增分类
     * @param categoryDTO
     * @return
     */
    @Operation(summary = "新增分类")
    @PostMapping
    public Result save(@RequestBody CategoryDTO categoryDTO) {
        log.info("新增分类：{}", categoryDTO.getName());
        categoryService.save(categoryDTO);
        return Result.success();
    }

    /**
     * 分类分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    @Operation(summary = "分类分页查询")
    @GetMapping("/page")
    public Result<PageResult> page(CategoryPageQueryDTO categoryPageQueryDTO) {
        log.info("分类分页查询：{}", categoryPageQueryDTO);
        PageResult pageResult = categoryService.page(categoryPageQueryDTO);
        return Result.success(pageResult);
    }

    /**
     * 删除分类
     * @param id
     * @return
     */
    @Operation(summary = "根据id删除分类")
    @DeleteMapping
    public Result deleteById(Integer id) {
        log.info("删除分类：{}", id);
        categoryService.deleteById(id);
        return Result.success();
    }

    /**
     * 修改分类
     * @param categoryDTO
     * @return
     */
    @Operation(summary = "修改分类")
    @PutMapping
    public Result update(@RequestBody CategoryDTO categoryDTO) {
        log.info("修改分类：{}", categoryDTO);
        categoryService.update(categoryDTO);
        return Result.success();
    }

    @Operation(summary = "启用、禁用分类")
    @PostMapping("/status/{status}")
    public Result updateStatus(@PathVariable Integer status, Long id) {
        log.info("修改分类状态：{}", status);
        categoryService.updateStatus(status, id);
        return Result.success();
    }

//    @Operation(summary = "根据类型查询分类")
//    @GetMapping("/list")
//    public Result<Category> list(Integer type) {
//        log.info("根据类型查询分类：{}", type);
//        List<Category> list = categoryService.list(type);
//        return Result.success();
//    }
}
