package com.lyoto.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyoto.common.utils.PageUtils;
import com.lyoto.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author lyoto
 * @email supreme00119@163.com
 * @date 2021-12-16 17:35:32
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

