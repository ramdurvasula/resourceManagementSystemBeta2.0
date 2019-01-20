package com.htcadvjava.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

	@GetMapping("/index")
	public String displayIndexPage() {
		
		return "index";
	}
	
}
