package com.mujio.mymall.order.dao;

import com.mujio.mymall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 14:35:58
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
