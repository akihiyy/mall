package org.yin.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:16:22
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

