package org.yin.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.product.entity.CategoryEntity;
import org.yin.mall.product.entity.dto.CategoryEntityDto;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:16:22
 */
public interface CategoryService extends IService<CategoryEntity> {

    /**
     * 分页查询
     * @param params
     * @return
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 生成树节点
     * @return
     */
    List<CategoryEntityDto> selectTree();

}

