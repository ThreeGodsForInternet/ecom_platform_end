package org.ecom.mall.modules.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ecom.mall.modules.coupon.domain.Coupon;
import org.ecom.mall.modules.coupon.service.CouponService;
import org.ecom.mall.modules.coupon.mapper.CouponMapper;
import org.springframework.stereotype.Service;

/**
 * @author sls-0
 * @description 针对表【coupon(优惠券表)】的数据库操作Service实现
 * @createDate 2026-06-08
 */
@Service
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon>
    implements CouponService {

}