package org.yin.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:16:22
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

