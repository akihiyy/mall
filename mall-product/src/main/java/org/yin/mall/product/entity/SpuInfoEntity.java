package org.yin.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

        import java.math.BigDecimal;
    import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * spu信息
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 17:53:23
 */
@Data
@ApiModel("SpuInfo实体类")
@TableName("pms_spu_info")
public class SpuInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            /**
         * 商品id
         */
                @TableId
            @ApiModelProperty("商品id")
    private Long id;
            /**
         * 商品名称
         */
            @ApiModelProperty("商品名称")
    private String spuName;
            /**
         * 商品描述
         */
            @ApiModelProperty("商品描述")
    private String spuDescription;
            /**
         * 所属分类id
         */
            @ApiModelProperty("所属分类id")
    private Long catalogId;
            /**
         * 品牌id
         */
            @ApiModelProperty("品牌id")
    private Long brandId;
            /**
         * 
         */
            @ApiModelProperty("")
    private BigDecimal weight;
            /**
         * 上架状态[0 - 下架，1 - 上架]
         */
            @ApiModelProperty("上架状态[0 - 下架，1 - 上架]")
    private Integer publishStatus;
            /**
         * 
         */
            @ApiModelProperty("")
    private Date createTime;
            /**
         * 
         */
            @ApiModelProperty("")
    private Date updateTime;
    
}
