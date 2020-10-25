package com.mujio.mymall.ware.dao;

import com.mujio.mymall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 14:37:24
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
