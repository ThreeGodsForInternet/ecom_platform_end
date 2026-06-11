package org.ecom.mall.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ecom.mall.modules.product.domain.Product;
import org.ecom.mall.modules.product.dto.ProductDetailVO;
import org.ecom.mall.modules.product.dto.ProductSearchRequest;
import org.ecom.mall.modules.product.mapper.ProductMapper;
import org.ecom.mall.modules.product.service.ProductService;
import org.ecom.mall.modules.product_detail.domain.ProductDetail;
import org.ecom.mall.modules.product_detail.service.ProductDetailService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService {

    private final ProductDetailService productDetailService;

    public ProductServiceImpl(ProductDetailService productDetailService) {
        this.productDetailService = productDetailService;
    }

    @Override
    public IPage<Product> searchPage(ProductSearchRequest request) {
        LambdaQueryWrapper<Product> wrapper = new LambdaQueryWrapper<>();

        // 只查上架商品
        wrapper.eq(Product::getStatus, 0);

        // 分类筛选
        if (request.getCategoryId() != null) {
            wrapper.eq(Product::getCategoryId, request.getCategoryId());
        }

        // 关键词搜索（名称、副标题）
        if (request.getKeyword() != null && !request.getKeyword().isBlank()) {
            String kw = request.getKeyword();
            wrapper.and(w -> w.like(Product::getName, kw).or().like(Product::getSubtitle, kw));
        }

        // 价格区间
        if (request.getMinPrice() != null) {
            wrapper.ge(Product::getPrice, request.getMinPrice());
        }
        if (request.getMaxPrice() != null) {
            wrapper.le(Product::getPrice, request.getMaxPrice());
        }

        // 库存区间
        if (request.getMinStock() != null) {
            wrapper.ge(Product::getStock, request.getMinStock());
        }
        if (request.getMaxStock() != null) {
            wrapper.le(Product::getStock, request.getMaxStock());
        }

        // 跨表筛选：品牌
        if (request.getBrand() != null && !request.getBrand().isBlank()) {
            wrapper.apply("id IN (SELECT product_id FROM product_detail WHERE brand = {0})",
                    request.getBrand());
        }

        // 跨表筛选：产地
        if (request.getOrigin() != null && !request.getOrigin().isBlank()) {
            wrapper.apply("id IN (SELECT product_id FROM product_detail WHERE origin = {0})",
                    request.getOrigin());
        }

        // 跨表筛选：城市
        if (request.getCity() != null && !request.getCity().isBlank()) {
            wrapper.apply("id IN (SELECT product_id FROM product_detail WHERE city = {0})",
                    request.getCity());
        }

        // 动态排序
        boolean asc = "asc".equalsIgnoreCase(request.getSortOrder());
        if ("price".equalsIgnoreCase(request.getSortBy())) {
            if (asc) {
                wrapper.orderByAsc(Product::getPrice);
            } else {
                wrapper.orderByDesc(Product::getPrice);
            }
        } else if ("sales".equalsIgnoreCase(request.getSortBy())) {
            if (asc) {
                wrapper.orderByAsc(Product::getSales);
            } else {
                wrapper.orderByDesc(Product::getSales);
            }
        } else if ("hot".equalsIgnoreCase(request.getSortBy())) {
            if (asc) {
                wrapper.orderByAsc(Product::getIsHot);
            } else {
                wrapper.orderByDesc(Product::getIsHot);
            }
        } else {
            // 默认：按 sort 升序、创建时间倒序
            wrapper.orderByAsc(Product::getSort).orderByDesc(Product::getCreateTime);
        }

        Page<Product> page = new Page<>(request.getPageNum(), request.getPageSize());
        return baseMapper.selectPage(page, wrapper);
    }

    @Override
    public ProductDetailVO getDetail(Long id) {
        Product product = baseMapper.selectById(id);
        if (product == null) {
            throw new RuntimeException("商品不存在");
        }

        ProductDetail detail = productDetailService.getByProductId(id);

        ProductDetailVO vo = new ProductDetailVO();
        BeanUtils.copyProperties(product, vo);

        if (detail != null) {
            vo.setContent(detail.getContent());
            vo.setBrand(detail.getBrand());
            vo.setOrigin(detail.getOrigin());
            vo.setCity(detail.getCity());
        }

        // 分享信息
        vo.setShareUrl("/pages/product/detail?id=" + id);
        vo.setShareTitle(product.getName());
        vo.setShareDesc(product.getSubtitle());
        vo.setShareImage(product.getImage());

        return vo;
    }
}
