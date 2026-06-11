package org.ecom.mall.modules.product_detail.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ecom.mall.modules.product_detail.domain.ProductDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author sls-0
* @description 针对表【product_detail(商品详情表)】的数据库操作Mapper
* @createDate 2026-06-08 13:04:53
* @Entity product_detail.domain.ProductDetail
*/
@Mapper
public interface ProductDetailMapper extends BaseMapper<ProductDetail> {

}




