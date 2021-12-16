package com.lyoto.gulimall.order.dao;

import com.lyoto.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author lyoto
 * @email supreme00119@163.com
 * @date 2021-12-16 17:35:33
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
