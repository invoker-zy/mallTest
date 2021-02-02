package com.example.mall.ware.dao;

import com.example.mall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author zhangzy
 * @email zhangzy@gmail.com
 * @date 2021-01-29 17:11:47
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
