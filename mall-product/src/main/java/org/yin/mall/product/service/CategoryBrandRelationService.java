package org.yin.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:16:22
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

