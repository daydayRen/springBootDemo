package com.yitian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yitian.controller.domain.BookBean;
/**
 * 
 * @author yitianRen
 * @date 2018年7月5日
 *
 */
@Controller
//组合注解
@SpringBootApplication
@EnableAutoConfiguration
public class HelloController {
	@Autowired
	private BookBean bookBean;
	
	@RequestMapping(value="/book")
	@ResponseBody
	public String fingBook(){
		//return new BookBean().sleep();
		return "Hello Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and Book price is "+bookBean.getPrice();
	}
	
	/**
	 * 
	 * @method_name hello
	 * @return_type String
	 * 
	 */
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		System.out.println("hello cainiao");
		return "hello demo";

	}

	public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}

}
