package org.ecom.mall.modules.productcategory.dto;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class ProductCategoryVO {

    private Long id;
    private String name;
    private Long parentId;
    private Integer sort;
    private List<ProductCategoryVO> children = new ArrayList<>();
}
