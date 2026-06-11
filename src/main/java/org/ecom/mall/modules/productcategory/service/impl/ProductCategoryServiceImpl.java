package org.ecom.mall.modules.productcategory.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ecom.mall.modules.productcategory.domain.ProductCategory;
import org.ecom.mall.modules.productcategory.service.ProductCategoryService;
import org.ecom.mall.modules.productcategory.mapper.ProductCategoryMapper;
import org.springframework.stereotype.Service;

/**
 * @author sls-0
 * @description 针对表【product_category(分类表)】的数据库操作Service实现
 * @createDate 2026-06-08
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory>
    implements ProductCategoryService {

}