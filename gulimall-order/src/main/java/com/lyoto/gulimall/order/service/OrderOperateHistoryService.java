package com.lyoto.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyoto.common.utils.PageUtils;
import com.lyoto.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author lyoto
 * @email supreme00119@163.com
 * @date 2021-12-16 17:35:33
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

