package com.lyoto.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.lyoto.common.utils.R;
import com.lyoto.gulimall.product.entity.CategoryEntity;
import com.lyoto.gulimall.product.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 商品三级分类
 *
 * @author lyoto
 * @email supreme00119@163.com
 * @date 2021-11-21 12:48:31
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	/**
	 * 查出所有分类以及子分类，以树形结构组装起来
	 */
	@RequestMapping("/list/tree")
	public R list(@RequestParam Map<String, Object> params) {
		List<CategoryEntity> entities = categoryService.listWithTree();
		return R.ok().put("data", entities);
	}


	/**
	 * 信息
	 */
	@RequestMapping("/info/{catId}")
	//@RequiresPermissions("product:category:info")
	public R info(@PathVariable("catId") Long catId) {
		CategoryEntity category = categoryService.getById(catId);

		return R.ok().put("category", category);
	}

	/**
	 * 保存
	 */
	@RequestMapping("/save")
	//@RequiresPermissions("product:category:save")
	public R save(@RequestBody CategoryEntity category) {
		categoryService.save(category);

		return R.ok();
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	//@RequiresPermissions("product:category:update")
	public R update(@RequestBody CategoryEntity category) {
		categoryService.updateById(category);

		return R.ok();
	}

	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	//@RequiresPermissions("product:category:delete")
	public R delete(@RequestBody Long[] catIds) {
		categoryService.removeByIds(Arrays.asList(catIds));

		return R.ok();
	}

}
