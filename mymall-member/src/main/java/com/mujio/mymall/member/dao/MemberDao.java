package com.mujio.mymall.member.dao;

import com.mujio.mymall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 13:54:23
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
