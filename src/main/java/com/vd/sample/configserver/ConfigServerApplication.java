package com.vd.sample.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {

	public static void main(String[] args) {

		System.out.print ("*****" + System.getenv("SDKMAN_DIR"));

		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
