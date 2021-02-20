package com.diaz.expert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name="man-socios")
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class DiazPractica02Num04MysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiazPractica02Num04MysqlApplication.class, args);
	}

}
