package com.example.mall.product;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 	1、整合mybatis-plus
 * 		1）、导入依赖
 * 		2）、配置
 * 			1、配置数据源：
 * 				1）、导入数据库的驱动；
 * 				2）、在application.yml里配置相关信息
 * 			2、配置Mybatis-Plus
 * 				1）、使用MybatisScan
 * 				2）、告诉Mybatis-Plus，sql映射文件位置
 */
@MapperScan("com.example.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallProductApplication.class, args);
	}

}
