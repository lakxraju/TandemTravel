package com.tandem.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"com.tandem.controller", "com.tandem.service", "com.tandem.dao"} )
public class TandemApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(TandemApplicationMain.class, args);
	}

}
