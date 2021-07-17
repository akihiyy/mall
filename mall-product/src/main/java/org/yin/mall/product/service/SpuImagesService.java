package org.yin.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:16:22
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

