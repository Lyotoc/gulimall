package com.lyoto.gulimall.product.dao;

import com.lyoto.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lyoto
 * @email supreme00119@163.com
 * @date 2021-11-21 12:48:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
