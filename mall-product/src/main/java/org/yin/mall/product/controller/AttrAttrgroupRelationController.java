package org.yin.mall.product.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.yin.mall.common.utils.PageUtils;
import org.yin.mall.common.utils.R;
import org.yin.mall.product.entity.AttrAttrgroupRelationEntity;
import org.yin.mall.product.service.AttrAttrgroupRelationService;

import java.util.Arrays;
import java.util.Map;


/**
 * 属性&属性分组关联
 *
 * @author tty
 * @email tantangyin@gmail.com
 * @date 2021-07-17 09:32:05
 */
@RestController
@AllArgsConstructor
@Api(tags = "product接口")
@RequestMapping("product/attrattrgrouprelation")
public class AttrAttrgroupRelationController {

    private final  AttrAttrgroupRelationService attrAttrgroupRelationService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation(" 列表显示")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = attrAttrgroupRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/{id}")
    @ApiOperation("信息显示")
    public R info(@PathVariable("id") Long id) {
            AttrAttrgroupRelationEntity attrAttrgroupRelation = attrAttrgroupRelationService.getById(id);

        return R.ok().put("attrAttrgroupRelation", attrAttrgroupRelation);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("添加")
    public R save(@RequestBody AttrAttrgroupRelationEntity attrAttrgroupRelation) {
            attrAttrgroupRelationService.save(attrAttrgroupRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping
    @ApiOperation("修改")
    public R update(@RequestBody AttrAttrgroupRelationEntity attrAttrgroupRelation) {
            attrAttrgroupRelationService.updateById(attrAttrgroupRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping
    @ApiOperation("根据id删除")
    public R delete(@RequestBody Long[] ids) {
            attrAttrgroupRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
