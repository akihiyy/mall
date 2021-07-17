package org.yin.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

    import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * sku销售属性&值
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 17:53:23
 */
@Data
@ApiModel("SkuSaleAttrValue实体类")
@TableName("pms_sku_sale_attr_value")
public class SkuSaleAttrValueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            /**
         * id
         */
                @TableId
            @ApiModelProperty("id")
    private Long id;
            /**
         * sku_id
         */
            @ApiModelProperty("sku_id")
    private Long skuId;
            /**
         * attr_id
         */
            @ApiModelProperty("attr_id")
    private Long attrId;
            /**
         * 销售属性名
         */
            @ApiModelProperty("销售属性名")
    private String attrName;
            /**
         * 销售属性值
         */
            @ApiModelProperty("销售属性值")
    private String attrValue;
            /**
         * 顺序
         */
            @ApiModelProperty("顺序")
    private Integer attrSort;
    
}
