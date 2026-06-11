package org.ecom.mall.modules.user.controller;
import org.ecom.mall.modules.user.domain.User;
import org.ecom.mall.modules.user.dto.UserUpdateRequest;
import org.ecom.mall.modules.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 查询所有
    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

    // 新增
    @PostMapping("/add")
    public String add(@RequestBody User student) {
        userService.save(student);
        return "新增成功";
    }

    // 更新用户信息
    @PutMapping("/update")
    public String update(@RequestBody UserUpdateRequest request) {
        userService.updateProfile(request);
        return "更新成功";
    }

}