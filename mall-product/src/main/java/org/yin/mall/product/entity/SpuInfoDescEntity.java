package org.yin.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

    import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * spu信息介绍
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 17:53:23
 */
@Data
@ApiModel("SpuInfoDesc实体类")
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            /**
         * 商品id
         */
                @TableId
            @ApiModelProperty("商品id")
    private Long spuId;
            /**
         * 商品介绍
         */
            @ApiModelProperty("商品介绍")
    private String decript;
    
}
