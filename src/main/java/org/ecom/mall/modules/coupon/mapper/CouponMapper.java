package org.ecom.mall.modules.coupon.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ecom.mall.modules.coupon.domain.Coupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author sls-0
 * @description 针对表【coupon(优惠券表)】的数据库操作Mapper
 * @createDate 2026-06-08
 */
@Mapper
public interface CouponMapper extends BaseMapper<Coupon> {

}