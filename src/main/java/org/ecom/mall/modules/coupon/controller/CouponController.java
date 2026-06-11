package org.ecom.mall.modules.coupon.controller;

import org.ecom.mall.modules.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.ecom.mall.modules.coupon.domain.Coupon;

/**
 * 优惠券Controller
 */
@RestController
@RequestMapping("/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping("/list")
    public List<Coupon> list() {
        return couponService.list();
    }

    @PostMapping("/add")
    public String add(@RequestBody Coupon coupon) {
        couponService.save(coupon);
        return "新增成功";
    }

    @PutMapping("/update")
    public String update(@RequestBody Coupon coupon) {
        couponService.updateById(coupon);
        return "修改成功";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        couponService.removeById(id);
        return "删除成功";
    }
}