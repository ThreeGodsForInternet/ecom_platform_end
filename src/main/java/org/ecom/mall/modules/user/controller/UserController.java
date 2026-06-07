package org.ecom.mall.modules.user.controller;
import org.ecom.mall.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.ecom.mall.modules.user.domain.User;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // 查询所有
    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

    // 新增
    @GetMapping("/add")
    public String add() {
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setEmail("xxx@qq.com");
        userService.save(user);
        return "success";
    }
}