package org.ecom.mall.modules.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ecom.mall.modules.order.domain.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author sls-0
 * @description 针对表【order(订单表)】的数据库操作Mapper
 * @createDate 2026-06-08
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}