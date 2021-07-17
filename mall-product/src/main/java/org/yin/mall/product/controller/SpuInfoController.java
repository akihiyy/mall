package org.yin.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.yin.mall.product.entity.SpuInfoEntity;
import org.yin.mall.product.service.SpuInfoService;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.common.utils.R;


/**
 * spu信息
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:32:05
 */
@RestController
@AllArgsConstructor
@Api(tags = "product接口")
@RequestMapping("product/spuinfo")
public class SpuInfoController {

    private final  SpuInfoService spuInfoService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation(" 列表显示")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spuInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/{id}")
    @ApiOperation("信息显示")
    public R info(@PathVariable("id") Long id) {
            SpuInfoEntity spuInfo = spuInfoService.getById(id);

        return R.ok().put("spuInfo", spuInfo);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("添加")
    public R save(@RequestBody SpuInfoEntity spuInfo) {
            spuInfoService.save(spuInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping
    @ApiOperation("修改")
    public R update(@RequestBody SpuInfoEntity spuInfo) {
            spuInfoService.updateById(spuInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping
    @ApiOperation("根据id删除")
    public R delete(@RequestBody Long[] ids) {
            spuInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
