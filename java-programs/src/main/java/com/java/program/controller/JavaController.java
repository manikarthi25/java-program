package com.java.program.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java-program")
public class JavaController {
	
	@GetMapping("/app-status")
	public String getAppStatus() {
		return "Success";
	}

}
