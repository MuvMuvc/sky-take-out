package com.sky.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "员工登录传入的数据模型")
public class EmployeeLoginDTO implements Serializable {

    @Schema(description = "用户名", required = true, example = "admin")
    private String username;

    @Schema(description = "密码", required = true, example = "123456")
    private String password;

}