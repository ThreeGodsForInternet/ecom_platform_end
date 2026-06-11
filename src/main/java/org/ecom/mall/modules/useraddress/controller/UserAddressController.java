package org.ecom.mall.modules.useraddress.controller;

import org.ecom.mall.modules.useraddress.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.ecom.mall.modules.useraddress.domain.UserAddress;

/**
 * 用户地址Controller
 */
@RestController
@RequestMapping("/user-address")
public class UserAddressController {

    @Autowired
    private UserAddressService userAddressService;

    @GetMapping("/list")
    public List<UserAddress> list() {
        return userAddressService.list();
    }

    @PostMapping("/add")
    public String add(@RequestBody UserAddress userAddress) {
        userAddressService.save(userAddress);
        return "新增成功";
    }

    @PutMapping("/update")
    public String update(@RequestBody UserAddress userAddress) {
        userAddressService.updateById(userAddress);
        return "修改成功";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        userAddressService.removeById(id);
        return "删除成功";
    }
}