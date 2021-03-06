package com.example.mall.product.dao;

import com.example.mall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author zhangzy
 * @email zhangzy@gmail.com
 * @date 2021-01-27 19:17:02
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
