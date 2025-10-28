package com.sky.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "分类")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键", required = true, example = "1")
    private Long id;

    @Schema(description = "类型: 1菜品分类 2套餐分类", required = true, example = "1")
    private Integer type;

    @Schema(description = "分类名称", required = true, example = "人气套餐")
    private String name;

    @Schema(description = "顺序", required = true, example = "1")
    private Integer sort;

    @Schema(description = "状态: 0禁用 1启用", required = true, example = "1")
    private Integer status;

    @Schema(description = "创建时间", required = true, example = "2023-05-05 00:00:00")
    private LocalDateTime createTime;

    @Schema(description = "更新时间", required = true, example = "2023-05-05 00:00:00")
    private LocalDateTime updateTime;

    @Schema(description = "创建人", required = true, example = "1")
    private Long createUser;

    @Schema(description = "更新人", required = true, example = "1")
    private Long updateUser;
}
