package com.ntl.topjobs.jobseekermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class JobseekermicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobseekermicroserviceApplication.class, args);
		System.out.println("Started Jop Seeker");
	}
}