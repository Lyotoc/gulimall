package com.lyoto.gulimall.coupon.dao;

import com.lyoto.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lyoto
 * @email supreme00119@163.com
 * @date 2021-11-26 17:12:20
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
