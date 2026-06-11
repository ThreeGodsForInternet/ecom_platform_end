package org.ecom.mall.modules.productcategory.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 分类表
 * @TableName product_category
 */
@TableName(value = "product_category")
@Data
public class ProductCategory {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 父级分类ID 0为顶级分类
     */
    private Long parentId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 状态 0正常 1禁用
     */
    private Integer status;
}