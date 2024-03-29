package com.sample.employee.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "com.sample.employee.*" })
@EnableJpaRepositories(basePackages = { "com.sample.employee.repo" })
@EntityScan("com.sample.employee.repo.*") 
public class EmployeeApplication {

	public static void main(String[] args) throws Exception {
		new SpringApplication(EmployeeApplication.class).run(args);
	}

}
 