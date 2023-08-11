package com.app.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

	@GetMapping("/greeting")
	public String greeting() {

		return "Spring Security Basic Authentication Example - Welcome ";
	}
}
