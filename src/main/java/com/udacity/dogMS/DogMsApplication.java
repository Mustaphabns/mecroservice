package com.udacity.dogMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DogMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogMsApplication.class, args);
	}

}
