package org.ecom.mall.modules.product.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ecom.mall.modules.product.domain.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author sls-0
* @description 针对表【product(商品表)】的数据库操作Mapper
* @createDate 2026-06-07 22:34:25
* @Entity generator.domain.Product
*/
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}




