package com.example.mall.product.dao;

import com.example.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangzy
 * @email zhangzy@gmail.com
 * @date 2021-01-27 19:17:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
