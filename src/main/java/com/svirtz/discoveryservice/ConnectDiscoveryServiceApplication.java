package com.svirtz.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConnectDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectDiscoveryServiceApplication.class, args);
	}

}
