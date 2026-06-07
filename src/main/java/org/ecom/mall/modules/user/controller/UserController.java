package org.ecom.mall.modules.user.controller;
import org.ecom.mall.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.ecom.mall.modules.user.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 查询所有
    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

    // 新增
    @PostMapping("/add")
    public String add(@RequestBody User student){
        userService.save(student);
        return "新增成功";
    }

}