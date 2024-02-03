package com.vijay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CommonseLogicApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonseLogicApplication.class, args);
	}

}
