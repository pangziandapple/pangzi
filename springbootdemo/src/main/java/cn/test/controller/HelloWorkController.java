package cn.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorkController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
}
