package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author orangeTop
 * @email orangeTop@foxmail.com
 * @date 2022-01-18 22:18:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
