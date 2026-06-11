package org.ecom.mall.modules.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.ecom.mall.modules.product.domain.Product;
import org.ecom.mall.modules.product.dto.ProductDetailVO;
import org.ecom.mall.modules.product.dto.ProductSearchRequest;

public interface ProductService extends IService<Product> {

    IPage<Product> searchPage(ProductSearchRequest request);

    ProductDetailVO getDetail(Long id);
}
