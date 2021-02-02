package com.example.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zhangzy
 * @email zhangzy@gmail.com
 * @date 2021-01-29 17:04:11
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

