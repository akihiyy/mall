package org.yin.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-16 14:08:29
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

