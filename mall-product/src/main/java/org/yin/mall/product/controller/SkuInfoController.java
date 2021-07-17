package org.yin.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.yin.mall.product.entity.SkuInfoEntity;
import org.yin.mall.product.service.SkuInfoService;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.common.utils.R;


/**
 * sku信息
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:32:05
 */
@RestController
@AllArgsConstructor
@Api(tags = "product接口")
@RequestMapping("product/skuinfo")
public class SkuInfoController {

    private final  SkuInfoService skuInfoService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation(" 列表显示")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = skuInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/{skuId}")
    @ApiOperation("信息显示")
    public R info(@PathVariable("skuId") Long skuId) {
            SkuInfoEntity skuInfo = skuInfoService.getById(skuId);

        return R.ok().put("skuInfo", skuInfo);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("添加")
    public R save(@RequestBody SkuInfoEntity skuInfo) {
            skuInfoService.save(skuInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping
    @ApiOperation("修改")
    public R update(@RequestBody SkuInfoEntity skuInfo) {
            skuInfoService.updateById(skuInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping
    @ApiOperation("根据id删除")
    public R delete(@RequestBody Long[] skuIds) {
            skuInfoService.removeByIds(Arrays.asList(skuIds));

        return R.ok();
    }

}
