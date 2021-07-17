package org.yin.mall.product.mapper;

import org.yin.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:19:08
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
