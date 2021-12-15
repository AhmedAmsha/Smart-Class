package com.SmartClass.ServicesReqistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class ServicesReqistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesReqistryApplication.class, args);
	}

}
