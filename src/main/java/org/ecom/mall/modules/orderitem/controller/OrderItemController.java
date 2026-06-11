package org.ecom.mall.modules.orderitem.controller;

import org.ecom.mall.modules.orderitem.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.ecom.mall.modules.orderitem.domain.OrderItem;

/**
 * 订单明细Controller
 */
@RestController
@RequestMapping("/order-item")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping("/list")
    public List<OrderItem> list() {
        return orderItemService.list();
    }

    @PostMapping("/add")
    public String add(@RequestBody OrderItem orderItem) {
        orderItemService.save(orderItem);
        return "新增成功";
    }

    @PutMapping("/update")
    public String update(@RequestBody OrderItem orderItem) {
        orderItemService.updateById(orderItem);
        return "修改成功";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        orderItemService.removeById(id);
        return "删除成功";
    }
}