package org.ecom.mall.modules.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ecom.mall.modules.product.domain.Product;
import org.ecom.mall.modules.product.service.ProductService;
import org.ecom.mall.modules.product.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author sls-0
* @description 针对表【product(商品表)】的数据库操作Service实现
* @createDate 2026-06-07 22:34:25
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




