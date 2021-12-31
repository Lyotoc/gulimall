package com.lyoto.gulimall.product.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyoto.common.utils.PageUtils;
import com.lyoto.gulimall.product.entity.CategoryEntity;

/**
 * 商品三级分类
 *
 * @author lyoto
 * @email supreme00119@163.com
 * @date 2021-11-21 12:48:31
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

	List<CategoryEntity> listWithTree();
}

