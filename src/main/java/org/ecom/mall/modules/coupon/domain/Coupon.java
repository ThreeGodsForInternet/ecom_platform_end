package org.ecom.mall.modules.coupon.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券表
 * @TableName coupon
 */
@TableName(value = "coupon")
@Data
public class Coupon {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 优惠券名称
     */
    private String name;

    /**
     * 类型 1满减券 2折扣券
     */
    private Integer type;

    /**
     * 满减门槛金额
     */
    private BigDecimal conditionAmount;

    /**
     * 优惠金额
     */
    private BigDecimal discountAmount;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 状态 0正常 1禁用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;
}