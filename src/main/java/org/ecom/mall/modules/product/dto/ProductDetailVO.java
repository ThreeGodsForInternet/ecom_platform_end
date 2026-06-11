package org.ecom.mall.modules.product.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ProductDetailVO {

    private Long id;
    private Long categoryId;
    private String name;
    private String subtitle;
    private String image;
    private BigDecimal price;
    private BigDecimal marketPrice;
    private Integer stock;
    private Integer sales;
    private Integer sort;
    private Integer isHot;
    private Integer isNew;
    private Integer isSale;
    private Integer status;
    private Date createTime;

    private String content;
    private String brand;
    private String origin;
    private String city;

    private String shareUrl;
    private String shareTitle;
    private String shareDesc;
    private String shareImage;
}
