package com.example.gateway;

import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages  = {"com.example.controller","com.example.service"})
@EnableCassandraRepositories(basePackages = "com.example.repository")
public class GatewayApplication {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		SpringApplication.run(GatewayApplication.class, args);

	}

}
