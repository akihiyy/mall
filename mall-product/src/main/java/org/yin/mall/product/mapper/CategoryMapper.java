package org.yin.mall.product.dao;

import org.yin.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 14:08:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}