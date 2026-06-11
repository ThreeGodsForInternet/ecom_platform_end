package org.ecom.mall.modules.user.dto;

import lombok.Data;

@Data
public class UserUpdateRequest {

    private Long userId;
    private String nickname;
    private String avatar;
    private String phone;
    private String email;
}