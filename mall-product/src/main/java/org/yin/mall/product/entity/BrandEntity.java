package org.yin.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

    import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 品牌
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 17:53:23
 */
@Data
@ApiModel("Brand实体类")
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            /**
         * 品牌id
         */
                @TableId
            @ApiModelProperty("品牌id")
    private Long brandId;
            /**
         * 品牌名
         */
            @ApiModelProperty("品牌名")
    private String name;
            /**
         * 品牌logo地址
         */
            @ApiModelProperty("品牌logo地址")
    private String logo;
            /**
         * 介绍
         */
            @ApiModelProperty("介绍")
    private String descript;
            /**
         * 显示状态[0-不显示；1-显示]
         */
            @ApiModelProperty("显示状态[0-不显示；1-显示]")
    private Integer showStatus;
            /**
         * 检索首字母
         */
            @ApiModelProperty("检索首字母")
    private String firstLetter;
            /**
         * 排序
         */
            @ApiModelProperty("排序")
    private Integer sort;
    
}
