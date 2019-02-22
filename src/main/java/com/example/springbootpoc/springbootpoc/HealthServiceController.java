package com.example.springbootpoc.springbootpoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthServiceController {

	@GetMapping("/health")
	public String getHealthStatus() {
		return "health is good";
	}
}
