package org.ecom.mall.modules.product_detail.service;

import org.ecom.mall.modules.product_detail.domain.ProductDetail;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author sls-0
* @description 针对表【product_detail(商品详情表)】的数据库操作Service
* @createDate 2026-06-08 13:04:53
*/
public interface ProductDetailService extends IService<ProductDetail> {

    ProductDetail getByProductId(Long productId);
}
