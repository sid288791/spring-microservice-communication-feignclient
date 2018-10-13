package com.helloservice.helloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloserviceApplication.class, args);
	}
}
