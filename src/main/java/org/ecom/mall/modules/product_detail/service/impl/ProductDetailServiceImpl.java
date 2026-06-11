package org.ecom.mall.modules.product_detail.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ecom.mall.modules.product_detail.domain.ProductDetail;
import org.ecom.mall.modules.product_detail.service.ProductDetailService;
import org.ecom.mall.modules.product_detail.mapper.ProductDetailMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailServiceImpl extends ServiceImpl<ProductDetailMapper, ProductDetail>
    implements ProductDetailService {

    @Override
    public ProductDetail getByProductId(Long productId) {
        LambdaQueryWrapper<ProductDetail> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(ProductDetail::getProductId, productId);
        return baseMapper.selectOne(wrapper);
    }
}




