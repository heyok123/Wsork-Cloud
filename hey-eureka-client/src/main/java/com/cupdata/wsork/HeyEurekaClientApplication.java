package com.cupdata.wsork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HeyEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeyEurekaClientApplication.class, args);
	}

}
