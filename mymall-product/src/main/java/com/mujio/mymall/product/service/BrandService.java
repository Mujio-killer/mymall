package com.mujio.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mujio.common.utils.PageUtils;
import com.mujio.mymall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 12:27:54
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

