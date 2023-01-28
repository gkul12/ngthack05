package com.cg.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.cg.backend.controller","com.cg.backend.service","com.cg.backend.dto", "com.cg.backend.config"})
@EnableJpaRepositories(basePackages = {"com.cg.backend.repository"})
@EntityScan(basePackages = {"com.cg.backend.entity"})
public class BrownFieldApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrownFieldApplication.class, args);
	}

}
