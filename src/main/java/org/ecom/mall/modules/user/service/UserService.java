package org.ecom.mall.modules.user.service;

import org.ecom.mall.modules.user.domain.User;
import org.ecom.mall.modules.user.dto.UserUpdateRequest;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author sls-0
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2026-06-06 21:26:23
*/
public interface UserService extends IService<User> {

    User findByUsername(String username);

    User findByPhone(String phone);

    void updateProfile(UserUpdateRequest request);
}