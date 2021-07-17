package org.yin.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.yin.mall.product.entity.SpuImagesEntity;
import org.yin.mall.product.service.SpuImagesService;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.common.utils.R;


/**
 * spu图片
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:32:05
 */
@RestController
@AllArgsConstructor
@Api(tags = "product接口")
@RequestMapping("product/spuimages")
public class SpuImagesController {

    private final  SpuImagesService spuImagesService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation(" 列表显示")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/{id}")
    @ApiOperation("信息显示")
    public R info(@PathVariable("id") Long id) {
            SpuImagesEntity spuImages = spuImagesService.getById(id);

        return R.ok().put("spuImages", spuImages);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("添加")
    public R save(@RequestBody SpuImagesEntity spuImages) {
            spuImagesService.save(spuImages);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping
    @ApiOperation("修改")
    public R update(@RequestBody SpuImagesEntity spuImages) {
            spuImagesService.updateById(spuImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping
    @ApiOperation("根据id删除")
    public R delete(@RequestBody Long[] ids) {
            spuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
