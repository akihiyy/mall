package org.yin.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

    import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * sku图片
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 17:53:23
 */
@Data
@ApiModel("SkuImages实体类")
@TableName("pms_sku_images")
public class SkuImagesEntity implements Serializable {
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
         * 图片地址
         */
            @ApiModelProperty("图片地址")
    private String imgUrl;
            /**
         * 排序
         */
            @ApiModelProperty("排序")
    private Integer imgSort;
            /**
         * 默认图[0 - 不是默认图，1 - 是默认图]
         */
            @ApiModelProperty("默认图[0 - 不是默认图，1 - 是默认图]")
    private Integer defaultImg;
    
}
