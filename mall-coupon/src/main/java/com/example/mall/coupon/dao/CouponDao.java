package com.example.mall.coupon.dao;

import com.example.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhangzy
 * @email zhangzy@gmail.com
 * @date 2021-01-29 15:08:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
