package com.mujio.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mujio.common.utils.PageUtils;
import com.mujio.mymall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 13:54:22
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

