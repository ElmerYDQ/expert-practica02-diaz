package com.diaz.expert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DiazPractica02Num03MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiazPractica02Num03MongodbApplication.class, args);
	}

}
