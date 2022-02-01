package com.application.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Appwel {

	@GetMapping("/app")
	public String welcome() {
		return "Welcome to String boot app";
	}
	
}
