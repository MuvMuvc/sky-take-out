package com.sky.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "新增分类传入的数据模型")
public class CategoryDTO implements Serializable {

    @Schema(description = "主键")
    private Long id;

    @Schema(description = "类型 1 菜品分类 2 套餐分类", required = true, example = "1")
    private Integer type;

    @Schema(description = "分类名称", required = true, example = "单人劲爽套餐")
    private String name;

    @Schema(description = "排序，按照升序排序", required = true, example = "1")
    private Integer sort;

}
