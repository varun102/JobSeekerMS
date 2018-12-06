package com.ntl.topjobs.jobseekermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
<<<<<<< HEAD
=======
import org.springframework.cloud.openfeign.EnableFeignClients;
>>>>>>> ca023389ec425d464ae5e054b1ca076e3cd5bd40
//import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
<<<<<<< HEAD
=======
@EnableFeignClients("com.ntl.topjobs.jobseekermicroservice")
>>>>>>> ca023389ec425d464ae5e054b1ca076e3cd5bd40
public class JobseekermicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobseekermicroserviceApplication.class, args);
		System.out.println("Started Jop Seeker");
	}
}
