package org.ecom.mall.modules.productcategory.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ecom.mall.modules.productcategory.domain.ProductCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author sls-0
 * @description 针对表【product_category(分类表)】的数据库操作Mapper
 * @createDate 2026-06-08
 */
@Mapper
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

}