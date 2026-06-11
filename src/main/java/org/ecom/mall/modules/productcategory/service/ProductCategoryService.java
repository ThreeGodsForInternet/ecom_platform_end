package org.ecom.mall.modules.productcategory.service;

import org.ecom.mall.modules.productcategory.domain.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import org.ecom.mall.modules.productcategory.dto.ProductCategoryVO;

import java.util.List;

public interface ProductCategoryService extends IService<ProductCategory> {

    List<ProductCategoryVO> getTree();
}