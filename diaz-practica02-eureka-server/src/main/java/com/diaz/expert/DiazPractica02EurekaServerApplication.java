package com.diaz.expert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiazPractica02EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiazPractica02EurekaServerApplication.class, args);
	}

}
