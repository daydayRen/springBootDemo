package com.yitian.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@EnableAutoConfiguration
public class HelloControler {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		System.out.println("hello cainiao");
		return "hello demo";

	}

	public static void main(String[] args) {
		SpringApplication.run(HelloControler.class, args);
	}

}
