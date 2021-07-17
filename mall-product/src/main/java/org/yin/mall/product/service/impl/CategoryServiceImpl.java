package org.yin.mall.product.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.common.utils.Query;

import org.yin.mall.product.entity.dto.CategoryEntityDto;
import org.yin.mall.product.mapper.CategoryMapper;
import org.yin.mall.product.entity.CategoryEntity;
import org.yin.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntityDto> selectTree() {

        // 1. 查询出所有商品分类
        List<CategoryEntity> categoryEntities = this.baseMapper.selectList(Wrappers.emptyWrapper());

        // 2.拿到所有一级节点进行组装
        List<CategoryEntityDto> tree = categoryEntities.stream()
                .filter(categoryEntity -> {
                    return 0 == categoryEntity.getParentCid();
                })
                .map(categoryEntity -> {
                    CategoryEntityDto categoryEntityDto = new CategoryEntityDto();
                    BeanUtils.copyProperties(categoryEntity, categoryEntityDto);
                    categoryEntityDto.setParentCid(0L);
                    categoryEntityDto.setChildren(getChildren(categoryEntityDto, categoryEntities));
                    return categoryEntityDto;
                }).collect(Collectors.toList());

        tree.sort(Comparator.comparing(CategoryEntityDto::getSort));

        return tree;
    }

    private List<CategoryEntityDto> getChildren(CategoryEntityDto root, List<CategoryEntity> list) {

        List<CategoryEntityDto> node = list.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId()))
                .map(categoryEntity -> {
                    CategoryEntityDto categoryEntityDto = new CategoryEntityDto();
                    BeanUtils.copyProperties(categoryEntity, categoryEntityDto);
                    categoryEntityDto.setChildren(getChildren(categoryEntityDto, list));
                    return categoryEntityDto;
                }).sorted((front,after)->{
                    return Optional.ofNullable(front.getSort()).orElse(0) - Optional.ofNullable(after.getSort()).orElse(0);
                })
                .collect(Collectors.toList());

        return node;
    }

}