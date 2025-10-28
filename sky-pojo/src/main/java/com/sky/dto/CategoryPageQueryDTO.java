package com.sky.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "分类分页查询传入的数据模型")
public class CategoryPageQueryDTO implements Serializable {

    @Schema(description = "页码", required = true, example = "1")
    private int page;

    @Schema(description = "每页记录数", required = true, example = "10")
    private int pageSize;

    @Schema(description = "分类名称", example = "传统主食")
    private String name;

    @Schema(description = "分类类型", example = "1")
    private Integer type;

}
