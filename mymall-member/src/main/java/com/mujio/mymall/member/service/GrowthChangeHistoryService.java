package com.mujio.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mujio.common.utils.PageUtils;
import com.mujio.mymall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 13:54:22
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

