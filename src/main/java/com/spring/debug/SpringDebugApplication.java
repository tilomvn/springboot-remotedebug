package com.spring.debug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringDebugApplication {

	Logger log = LoggerFactory.getLogger(SpringDebugApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDebugApplication.class, args);
	}

	@Bean
	ApplicationRunner runner() {
		return args -> {
			log.info("AAAA");
			log.info("BBBb");
		};
	}
}
