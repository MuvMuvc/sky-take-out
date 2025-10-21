package com.sky.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "员工登录返回的数据格式")
public class EmployeeLoginVO implements Serializable {

    @Schema(description = "主键值", example = "1")
    private Long id;

    @Schema(description = "用户名", example = "admin")
    private String userName;

    @Schema(description = "姓名", example = "王二狗")
    private String name;

    @Schema(description = "jwt令牌", example = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTY1MjYxMzE5NywiZXhwIjoxNjUyNjE3Mzk3fQ.x7Z7Z7Z7Z7Z7Z7Z7Z")
    private String token;

}