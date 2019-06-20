package com.tandem.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class EntryController {

	@RequestMapping("/")
	public String sendWelcomeText() {
		return "Welcome to Spring Boot Application! ";
	}
}
