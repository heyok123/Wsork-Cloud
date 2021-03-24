package com.cupdata.wsork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HeyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeyEurekaServerApplication.class, args);
	}

	/**
	 * Eureka常用配置
	 *
	 * eureka:
	 *   client: #eureka客户端配置
	 *     register-with-eureka: true #是否将自己注册到eureka服务端上去
	 *     fetch-registry: true #是否获取eureka服务端上注册的服务列表
	 *     service-url:
	 *       defaultZone: http://localhost:8001/eureka/ # 指定注册中心地址
	 *     enabled: true # 启用eureka客户端
	 *     registry-fetch-interval-seconds: 30 #定义去eureka服务端获取服务列表的时间间隔
	 *   instance: #eureka客户端实例配置
	 *     lease-renewal-interval-in-seconds: 30 #定义服务多久去注册中心续约
	 *     lease-expiration-duration-in-seconds: 90 #定义服务多久不去续约认为服务失效
	 *     metadata-map:
	 *       zone: jiangsu #所在区域
	 *     hostname: localhost #服务主机名称
	 *     prefer-ip-address: false #是否优先使用ip来作为主机名
	 *   server: #eureka服务端配置
	 *     enable-self-preservation: false #关闭eureka服务端的保护机制
	 */
}


