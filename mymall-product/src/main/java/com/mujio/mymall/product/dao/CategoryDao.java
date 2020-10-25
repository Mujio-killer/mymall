package com.mujio.mymall.product.dao;

import com.mujio.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mujio
 * @email gaoziyou@foxmail.com
 * @date 2020-07-19 12:27:54
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
