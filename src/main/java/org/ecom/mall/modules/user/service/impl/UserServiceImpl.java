package org.ecom.mall.modules.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ecom.mall.modules.user.domain.User;
import org.ecom.mall.modules.user.dto.UserUpdateRequest;
import org.ecom.mall.modules.user.service.UserService;
import org.ecom.mall.modules.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author sls-0
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2026-06-06 21:26:23
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

// 快捷设置
    @Override
    public User findByUsername(String username) {
        return baseMapper.selectByUsername(username);
    }

    @Override
    public User findByPhone(String phone) {
        return baseMapper.selectByPhone(phone);
    }

    @Override
    public void updateProfile(UserUpdateRequest request) {
        User user = baseMapper.selectById(request.getUserId());
        if (user == null) {
            throw new RuntimeException("用户不存在");
        }

        if (request.getNickname() != null) {
            user.setNickname(request.getNickname());
        }
        if (request.getAvatar() != null) {
            user.setAvatar(request.getAvatar());
        }
        if (request.getPhone() != null) {
            user.setPhone(request.getPhone());
        }
        if (request.getEmail() != null) {
            user.setEmail(request.getEmail());
        }

        baseMapper.updateById(user);
    }
}