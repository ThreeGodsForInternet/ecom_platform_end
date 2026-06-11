package org.ecom.mall.modules.order.controller;

import org.ecom.mall.modules.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.ecom.mall.modules.order.domain.Order;

/**
 * 订单Controller
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/list")
    public List<Order> list() {
        return orderService.list();
    }

    @PostMapping("/add")
    public String add(@RequestBody Order order) {
        orderService.save(order);
        return "新增成功";
    }

    @PutMapping("/update")
    public String update(@RequestBody Order order) {
        orderService.updateById(order);
        return "修改成功";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        orderService.removeById(id);
        return "删除成功";
    }
}