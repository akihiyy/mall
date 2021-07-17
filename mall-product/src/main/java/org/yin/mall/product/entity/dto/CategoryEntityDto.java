package org.yin.mall.product.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 商品分类数据传输对象
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:32:05
 */
@Data
@EqualsAndHashCode
public class CategoryEntityDto implements Serializable {

    private Long catId;
    private Long parentCid;
    private String name;
    private Integer sort;
    private String icon;
    private List<CategoryEntityDto> children;

}
