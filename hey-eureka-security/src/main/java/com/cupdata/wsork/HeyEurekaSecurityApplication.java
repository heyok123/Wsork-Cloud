package com.cupdata.wsork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HeyEurekaSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeyEurekaSecurityApplication.class, args);
	}

}
