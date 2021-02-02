package com.example.mall.ware.dao;

import com.example.mall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author zhangzy
 * @email zhangzy@gmail.com
 * @date 2021-01-29 17:11:48
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
