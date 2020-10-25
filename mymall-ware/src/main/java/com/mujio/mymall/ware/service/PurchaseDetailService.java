package com.mujio.mymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mujio.common.utils.PageUtils;
import com.mujio.mymall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 14:37:24
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

