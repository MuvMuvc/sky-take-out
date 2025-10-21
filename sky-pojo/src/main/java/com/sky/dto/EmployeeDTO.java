package com.sky.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "新增员工传入的数据模型")
public class EmployeeDTO implements Serializable {

    @Schema(description = "员工id")
    private Long id;

    @Schema(description = "用户名", required = true, example = "zhangsan")
    private String username;

    @Schema(description = "姓名", required = true, example = "张三")
    private String name;

    @Schema(description = "手机号", required = true, example = "13812345678")
    private String phone;

    @Schema(description = "性别，0女1男", required = true, example = "1")
    private String sex;

    @Schema(description = "身份证号", required = true, example = "123456789012345678")
    private String idNumber;

}
