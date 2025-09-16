package edu.ce.fisa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class Controller {
	@GetMapping("/get")
	public String getReqRes() {
		return "get gihyun";
	}
	
	//http://localhost:8080/app/post
	@PostMapping("/post")
	public String getReqRes2() {
		return "post gihyun";
	}
	
}
