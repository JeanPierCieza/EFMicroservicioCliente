package com.idat.ef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EfJeanPierCiezaMicroservicioClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJeanPierCiezaMicroservicioClienteApplication.class, args);
	}

}
