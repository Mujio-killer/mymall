package com.mujio.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mujio.common.utils.PageUtils;
import com.mujio.mymall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 13:54:23
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

