package org.yin.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.yin.mall.product.entity.SpuInfoDescEntity;
import org.yin.mall.product.service.SpuInfoDescService;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.common.utils.R;


/**
 * spu信息介绍
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:32:05
 */
@RestController
@AllArgsConstructor
@Api(tags = "product接口")
@RequestMapping("product/spuinfodesc")
public class SpuInfoDescController {

    private final  SpuInfoDescService spuInfoDescService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation(" 列表显示")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spuInfoDescService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/{spuId}")
    @ApiOperation("信息显示")
    public R info(@PathVariable("spuId") Long spuId) {
            SpuInfoDescEntity spuInfoDesc = spuInfoDescService.getById(spuId);

        return R.ok().put("spuInfoDesc", spuInfoDesc);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("添加")
    public R save(@RequestBody SpuInfoDescEntity spuInfoDesc) {
            spuInfoDescService.save(spuInfoDesc);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping
    @ApiOperation("修改")
    public R update(@RequestBody SpuInfoDescEntity spuInfoDesc) {
            spuInfoDescService.updateById(spuInfoDesc);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping
    @ApiOperation("根据id删除")
    public R delete(@RequestBody Long[] spuIds) {
            spuInfoDescService.removeByIds(Arrays.asList(spuIds));

        return R.ok();
    }

}
