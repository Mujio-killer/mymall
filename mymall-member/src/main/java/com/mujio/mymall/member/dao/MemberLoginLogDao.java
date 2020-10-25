package com.mujio.mymall.member.dao;

import com.mujio.mymall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 13:54:22
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
