package com.example.feignClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feignClient.interfaceUtil.FeignClientInterface;

@RestController
@RequestMapping("/demo")
public class FeignClientController {

	@Autowired
	private FeignClientInterface clientInterface;
	
	@GetMapping("/user-name")
	public String getUserName() {
		
		System.out.print("hi");
		return clientInterface.getName();
	}
	
	@GetMapping("/user-address")
	public String getUserAddress() {
		return clientInterface.getAddress();
	}
	
	@GetMapping("/user-status")
	public String getUserStatus() {
		return clientInterface.getStatus();
	}
	
}
