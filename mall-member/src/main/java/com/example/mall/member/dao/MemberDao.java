package com.example.mall.member.dao;

import com.example.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangzy
 * @email zhangzy@gmail.com
 * @date 2021-01-29 16:43:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
