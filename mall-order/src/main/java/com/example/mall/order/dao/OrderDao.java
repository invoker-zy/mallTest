package com.example.mall.order.dao;

import com.example.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangzy
 * @email zhangzy@gmail.com
 * @date 2021-01-29 17:04:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
