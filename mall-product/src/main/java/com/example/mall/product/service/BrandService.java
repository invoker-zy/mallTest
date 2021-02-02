package com.example.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zhangzy
 * @email zhangzy@gmail.com
 * @date 2021-01-27 19:17:03
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

