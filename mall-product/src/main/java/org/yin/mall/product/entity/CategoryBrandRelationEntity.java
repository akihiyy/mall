package org.yin.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

    import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 品牌分类关联
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 17:53:23
 */
@Data
@ApiModel("CategoryBrandRelation实体类")
@TableName("pms_category_brand_relation")
public class CategoryBrandRelationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            /**
         * 
         */
                @TableId
            @ApiModelProperty("")
    private Long id;
            /**
         * 品牌id
         */
            @ApiModelProperty("品牌id")
    private Long brandId;
            /**
         * 分类id
         */
            @ApiModelProperty("分类id")
    private Long catelogId;
            /**
         * 
         */
            @ApiModelProperty("")
    private String brandName;
            /**
         * 
         */
            @ApiModelProperty("")
    private String catelogName;
    
}
