package com.example.graaldemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraalDemoController {

	@GetMapping("/")
	public String index() {
		return "Hello Graal";
	}
}
