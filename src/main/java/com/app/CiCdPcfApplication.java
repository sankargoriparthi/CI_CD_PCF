package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class CiCdPcfApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdPcfApplication.class, args);
	}
@GetMapping
	public String hello() {
		return "Welcome to CI and CD For Pcf";
	}
}
