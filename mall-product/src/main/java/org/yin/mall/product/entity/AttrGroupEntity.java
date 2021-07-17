package org.yin.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

    import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 属性分组
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 17:53:23
 */
@Data
@ApiModel("AttrGroup实体类")
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            /**
         * 分组id
         */
                @TableId
            @ApiModelProperty("分组id")
    private Long attrGroupId;
            /**
         * 组名
         */
            @ApiModelProperty("组名")
    private String attrGroupName;
            /**
         * 排序
         */
            @ApiModelProperty("排序")
    private Integer sort;
            /**
         * 描述
         */
            @ApiModelProperty("描述")
    private String descript;
            /**
         * 组图标
         */
            @ApiModelProperty("组图标")
    private String icon;
            /**
         * 所属分类id
         */
            @ApiModelProperty("所属分类id")
    private Long catelogId;
    
}
