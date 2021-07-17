package org.yin.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.yin.mall.product.entity.SkuImagesEntity;
import org.yin.mall.product.service.SkuImagesService;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.common.utils.R;


/**
 * sku图片
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:32:05
 */
@RestController
@AllArgsConstructor
@Api(tags = "product接口")
@RequestMapping("product/skuimages")
public class SkuImagesController {

    private final  SkuImagesService skuImagesService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation(" 列表显示")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = skuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/{id}")
    @ApiOperation("信息显示")
    public R info(@PathVariable("id") Long id) {
            SkuImagesEntity skuImages = skuImagesService.getById(id);

        return R.ok().put("skuImages", skuImages);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("添加")
    public R save(@RequestBody SkuImagesEntity skuImages) {
            skuImagesService.save(skuImages);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping
    @ApiOperation("修改")
    public R update(@RequestBody SkuImagesEntity skuImages) {
            skuImagesService.updateById(skuImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping
    @ApiOperation("根据id删除")
    public R delete(@RequestBody Long[] ids) {
            skuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
