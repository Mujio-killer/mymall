package com.mujio.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mujio.common.utils.PageUtils;
import com.mujio.mymall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 12:27:54
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

