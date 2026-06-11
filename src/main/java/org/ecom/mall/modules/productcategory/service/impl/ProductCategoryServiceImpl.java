package org.ecom.mall.modules.productcategory.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ecom.mall.modules.productcategory.domain.ProductCategory;
import org.ecom.mall.modules.productcategory.dto.ProductCategoryVO;
import org.ecom.mall.modules.productcategory.mapper.ProductCategoryMapper;
import org.ecom.mall.modules.productcategory.service.ProductCategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory>
    implements ProductCategoryService {

    @Override
    public List<ProductCategoryVO> getTree() {
        LambdaQueryWrapper<ProductCategory> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(ProductCategory::getStatus, 0)
               .orderByAsc(ProductCategory::getSort);
        List<ProductCategory> all = baseMapper.selectList(wrapper);

        List<ProductCategoryVO> roots = new ArrayList<>();
        for (ProductCategory cat : all) {
            if (cat.getParentId() == null || cat.getParentId() == 0) {
                roots.add(toVO(cat, all));
            }
        }
        return roots;
    }

    private ProductCategoryVO toVO(ProductCategory cat, List<ProductCategory> all) {
        ProductCategoryVO vo = new ProductCategoryVO();
        vo.setId(cat.getId());
        vo.setName(cat.getName());
        vo.setParentId(cat.getParentId());
        vo.setSort(cat.getSort());

        for (ProductCategory child : all) {
            if (child.getParentId() != null && child.getParentId().equals(cat.getId())) {
                vo.getChildren().add(toVO(child, all));
            }
        }
        return vo;
    }
}