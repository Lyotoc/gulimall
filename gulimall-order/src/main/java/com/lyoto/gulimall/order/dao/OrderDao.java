package com.lyoto.gulimall.order.dao;

import com.lyoto.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lyoto
 * @email supreme00119@163.com
 * @date 2021-12-16 17:35:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
