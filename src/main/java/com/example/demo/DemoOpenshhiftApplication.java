package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoOpenshhiftApplication {

	@GetMapping("/welocme")
	public String getWelcome() {
		return "Welcom to java open Shift.";
		
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Welcome to Sam's app :) " +input + " your Openshift successfuly deployed!!";
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoOpenshhiftApplication.class, args);
		System.out.println("Inside");
	}

}
