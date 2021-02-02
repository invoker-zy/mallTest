package com.example.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zhangzy
 * @email zhangzy@gmail.com
 * @date 2021-01-29 16:43:59
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

