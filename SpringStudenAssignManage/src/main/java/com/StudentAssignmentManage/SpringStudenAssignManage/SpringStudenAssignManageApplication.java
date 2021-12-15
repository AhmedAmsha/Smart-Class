package com.StudentAssignmentManage.SpringStudenAssignManage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringStudenAssignManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudenAssignManageApplication.class, args);
	}
        @Bean
        @LoadBalanced
        public RestTemplate restTamplates()
        {
            return new RestTemplate();
        }
}
