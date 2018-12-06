package com.ntl.topjobs.jobseekermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.ntl.topjobs.jobseekermicroservice")
public class JobseekermicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobseekermicroserviceApplication.class, args);
		System.out.println("Started Jop Seeker");
	}
//    @Bean
//    public Sampler defaultSampler() {
//    	return Sampler.ALWAYS_SAMPLE;
//    }
	
}
