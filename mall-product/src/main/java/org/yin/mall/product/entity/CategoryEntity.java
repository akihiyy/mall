package org.yin.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

    import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 商品三级分类
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 17:53:23
 */
@Data
@ApiModel("Category实体类")
@TableName("pms_category")
public class CategoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            /**
         * 分类id
         */
                @TableId
            @ApiModelProperty("分类id")
    private Long catId;
            /**
         * 分类名称
         */
            @ApiModelProperty("分类名称")
    private String name;
            /**
         * 父分类id
         */
            @ApiModelProperty("父分类id")
    private Long parentCid;
            /**
         * 层级
         */
            @ApiModelProperty("层级")
    private Integer catLevel;
            /**
         * 是否显示[0-不显示，1显示]
         */
            @ApiModelProperty("是否显示[0-不显示，1显示]")
    private Integer showStatus;
            /**
         * 排序
         */
            @ApiModelProperty("排序")
    private Integer sort;
            /**
         * 图标地址
         */
            @ApiModelProperty("图标地址")
    private String icon;
            /**
         * 计量单位
         */
            @ApiModelProperty("计量单位")
    private String productUnit;
            /**
         * 商品数量
         */
            @ApiModelProperty("商品数量")
    private Integer productCount;
            /**
         * 创建人
         */
            @ApiModelProperty("创建人")
    private String createBy;
            /**
         * 修改人
         */
            @ApiModelProperty("修改人")
    private String updateBy;
            /**
         * 创建时间
         */
            @ApiModelProperty("创建时间")
    private Date createTime;
            /**
         * 修改时间
         */
            @ApiModelProperty("修改时间")
    private Date updateTime;
    
}
