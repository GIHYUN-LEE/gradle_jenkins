package edu.ce.fisa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
//http://localhost:8088/app/get
public class Controller {
	@GetMapping("/get")
	public String getReqRes() {
		return "Kang Hsefsefsefan dddkSol! !";
	}
	
	//http://localhost:8088/app/post
	@PostMapping("/post")
	public String getReqRes2() {
		return "This is TsefsefO-BsefefE rdgbcfbrdghpost method!!!!!";
	}
	
}
