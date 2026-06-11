package org.ecom.mall.modules.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ecom.mall.modules.order.domain.Order;
import org.ecom.mall.modules.order.service.OrderService;
import org.ecom.mall.modules.order.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
 * @author sls-0
 * @description 针对表【order(订单表)】的数据库操作Service实现
 * @createDate 2026-06-08
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService {

}