package com.mujio.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mujio.common.utils.PageUtils;
import com.mujio.mymall.coupon.entity.CategoryBoundsEntity;

import java.util.Map;

/**
 * 商品分类积分设置
 *
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 13:39:46
 */
public interface CategoryBoundsService extends IService<CategoryBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

