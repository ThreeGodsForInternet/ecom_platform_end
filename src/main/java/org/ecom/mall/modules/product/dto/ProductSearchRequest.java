package org.ecom.mall.modules.product.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductSearchRequest {

    private Long categoryId;
    private String keyword;
    private String brand;
    private String origin;
    private String city;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
    private Integer minStock;
    private Integer maxStock;
    private String sortBy;
    private String sortOrder;
    private Integer pageNum = 1;
    private Integer pageSize = 10;
}
