package com.lyoto.gulimall.member.dao;

import com.lyoto.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lyoto
 * @email supreme00119@163.com
 * @date 2021-11-26 18:00:12
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
