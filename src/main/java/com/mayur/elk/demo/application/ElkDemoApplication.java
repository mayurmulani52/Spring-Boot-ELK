package com.mayur.elk.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.mayur"})
public class ElkDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElkDemoApplication.class, args);
	}

}
