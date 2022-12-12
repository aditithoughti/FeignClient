package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class DemoController {

	@GetMapping("/name")
	public String getName() {
		return "Play Java";
	}

	@GetMapping("/address")
	public String getAddress() {
		return "India !";
	}

	@GetMapping("/status")
	public String getStatus() {
		return "active";
	}

}
