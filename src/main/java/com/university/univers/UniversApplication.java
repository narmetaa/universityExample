package com.university.univers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages="com.university")
@EntityScan("com.university.pojos")
@EnableJpaRepositories("com.university.dao")
public class UniversApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversApplication.class, args);
	}

}
