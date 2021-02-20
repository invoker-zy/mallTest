package com.example.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、如何使用nacos配置中心统一管理配置
 *  1）、引入依赖
 *  <dependency>
 *  <groupId>com.alibaba.cloud</groupId>
 *  <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *  </dependency>
 *  2）、创建一个bootstrap.properties
 *  spring.application.name=mall-coupon.properties
 *  spring.cloud.nacos.config.server-addr=8.136.152.26:8848
 *  3）、需要给配置中心默认添加一个 数据集(Data Id) mall-coupon.properties 默认规则,应用名.properties
 *  4）、给应用名添加配置
 *  5）、获取动态配置。
 *
 * @RefreshScope : 动态获取配置并刷新
 * @Value("$(配置项的名)") 获取配置
 * 如果配置中心和配置文件都配置了相同的项,优先使用配置中心的配置
 * 2、细节
 *  1）、命名空间
 *  配置隔离：
 *  默认为public(保留空间)，默认新增的所有配置都在public空间。
 *      1、开发，测试、生产，利用命名空间进行环境隔离，在bootstrap.properties配置上，需要使用命名空间下的配置
 *      spring.cloud.nacos.config.namespace = 43007028-0f7b-4dc4-b6b4-7ed43e00faee(命名空间ID)
 *      2、每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 * 2）、配置集：所有配置的集合
 *
 * 3）、配置集ID：类似配置文件名
 *      Data ID：文件名
 * 4）、配置分组：
 *      默认所有的配置集都属于DEFAULT_GROUP；
 *      在nacos新建文件进行分组之后，也可以在bootstrap.properties中，进行指定配置文件的使用
 * 项目中的使用：每个微服务创建自己的命名空间，使用配置分组区分环境，dev，test，prod
 *
 * 3、同时加载多个配置集
 * 1)、微服务任何配置信息，任何配置文件都可以放在配置中心中
 * 2）、只需要在bootstrap.properties说明加载配置中心中哪些配置文件即可
 * 3）、@Value，@ConfigurationProperties...
 * 以前springBoot任何方式从配置文件中获取值，都能使用。
 * 配置中心有的优先使用配置中心的值
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
