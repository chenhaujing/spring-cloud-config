package com.chj.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
	
	@Value("${profile}")
	private String profile;

	@RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

	@GetMapping("/profile")
    public String getProfile() {
    	return this.profile;
    }

	
}
