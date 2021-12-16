package com.lyoto.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyoto.common.utils.PageUtils;
import com.lyoto.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author lyoto
 * @email supreme00119@163.com
 * @date 2021-12-16 17:55:34
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

