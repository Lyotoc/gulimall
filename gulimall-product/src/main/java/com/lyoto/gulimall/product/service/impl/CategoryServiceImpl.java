package com.lyoto.gulimall.product.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyoto.common.utils.PageUtils;
import com.lyoto.common.utils.Query;
import com.lyoto.gulimall.product.dao.CategoryDao;
import com.lyoto.gulimall.product.entity.CategoryEntity;
import com.lyoto.gulimall.product.service.CategoryService;

import org.springframework.stereotype.Service;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		IPage<CategoryEntity> page = this.page(
				new Query<CategoryEntity>().getPage(params),
				new QueryWrapper<CategoryEntity>()
		);

		return new PageUtils(page);
	}

	@Override
	public List<CategoryEntity> listWithTree() {
		// 1、查出所有分类
		List<CategoryEntity> entities = this.baseMapper.selectList(null);
		// 2、组装成父子的树形结构
		List<CategoryEntity> level1Menus = entities.stream()
				.filter(categoryEntity -> categoryEntity.getParentCid() == 0)
				.map(menu -> {
					menu.setChildren(getChildrens(menu, entities));
					return menu;
				}).sorted((menu1, menu2) -> Optional.of(menu1.getSort()).orElse(0) - Optional.of(menu2.getSort()).orElse(0)
				).collect(Collectors.toList());
		return level1Menus;
	}

	/**
	 * 递归查找所有菜单的子菜单
	 * @param root 当前菜单节点
	 * @param all    所有菜单
	 * @return
	 */
	private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
		List<CategoryEntity> children = all.stream()
				.filter(categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId())
				)
				.map(menu -> {
					//1、找到子菜单
					menu.setChildren(this.getChildrens(menu, all));
					return menu;
					//2、菜单排序
				}).sorted((menu1, menu2) -> Optional.ofNullable(menu1.getSort()).orElse(0) - Optional.ofNullable(menu2.getSort()).orElse(0)).collect(Collectors.toList());
		return children;
	}
}