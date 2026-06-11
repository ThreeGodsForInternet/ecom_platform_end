package org.ecom.mall.modules.auth.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {

//    没有做特殊处理
    @NotBlank(message = "用户名不能为空")
    @Size(min = 3, max = 50, message = "用户名长度为3-50个字符")
    private String username;

    @NotBlank(message = "密码不能为空")
    @Size(min = 6, max = 100, message = "密码长度为6-100个字符")
    private String password;
    @NotBlank(message = "手机号不能为空")
    @Size(min = 11, max=11 , message = "手机号应符合格式")
    private String phone;

    private String email;

    private String nickname;
}