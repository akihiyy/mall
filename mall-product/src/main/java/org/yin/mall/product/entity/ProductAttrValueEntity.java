package org.yin.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

    import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * spu属性值
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 17:53:23
 */
@Data
@ApiModel("ProductAttrValue实体类")
@TableName("pms_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            /**
         * id
         */
                @TableId
            @ApiModelProperty("id")
    private Long id;
            /**
         * 商品id
         */
            @ApiModelProperty("商品id")
    private Long spuId;
            /**
         * 属性id
         */
            @ApiModelProperty("属性id")
    private Long attrId;
            /**
         * 属性名
         */
            @ApiModelProperty("属性名")
    private String attrName;
            /**
         * 属性值
         */
            @ApiModelProperty("属性值")
    private String attrValue;
            /**
         * 顺序
         */
            @ApiModelProperty("顺序")
    private Integer attrSort;
            /**
         * 快速展示【是否展示在介绍上；0-否 1-是】
         */
            @ApiModelProperty("快速展示【是否展示在介绍上；0-否 1-是】")
    private Integer quickShow;
    
}
