package org.ecom.mall.modules.orderitem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ecom.mall.modules.orderitem.domain.OrderItem;
import org.ecom.mall.modules.orderitem.service.OrderItemService;
import org.ecom.mall.modules.orderitem.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;

/**
 * @author sls-0
 * @description 针对表【order_item(订单明细表)】的数据库操作Service实现
 * @createDate 2026-06-08
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem>
    implements OrderItemService {

}