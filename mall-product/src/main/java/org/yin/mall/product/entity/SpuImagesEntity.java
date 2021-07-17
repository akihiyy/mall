package org.yin.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

    import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * spu图片
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 17:53:23
 */
@Data
@ApiModel("SpuImages实体类")
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            /**
         * id
         */
                @TableId
            @ApiModelProperty("id")
    private Long id;
            /**
         * spu_id
         */
            @ApiModelProperty("spu_id")
    private Long spuId;
            /**
         * 图片名
         */
            @ApiModelProperty("图片名")
    private String imgName;
            /**
         * 图片地址
         */
            @ApiModelProperty("图片地址")
    private String imgUrl;
            /**
         * 顺序
         */
            @ApiModelProperty("顺序")
    private Integer imgSort;
            /**
         * 是否默认图
         */
            @ApiModelProperty("是否默认图")
    private Integer defaultImg;
    
}
