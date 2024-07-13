package com.main.reactive_example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.main.reactive_example.service.UserService;

@RestController
public class Controller {
	
	@Autowired
	UserService userService;

	@GetMapping("/hello")
	public ResponseEntity<String> getData() {
		String response = null;
		try {
			response = "Hello";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<String> getUserData(@PathVariable String userId) {
		String response = null;
		try {
			userService.getUserDetail();
			
			response = "Hello "+userId;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
