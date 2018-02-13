package com.udemy.backendninja.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/rest")

public class RestController {
	
	@GetMapping("/checkrest")
	public ResponseEntity<String> checkRest(){
		return new ResponseEntity<String>("OK!", HttpStatus.OK);
	}
	
}
