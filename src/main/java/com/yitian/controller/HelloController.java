package com.yitian.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yitian.controller.domain.BookBean;
/**
 * 
 * @author yitianRen
 * @date 2018年7月5日
 *
 */
@RestController
//组合注解
@SpringBootApplication
@EnableAutoConfiguration
public class HelloController {
	
	public final static Logger logger = LoggerFactory.getLogger(HelloController.class);	
	@Autowired
	private BookBean bookBean;
	
	@RequestMapping(value="/book")
	@ResponseBody
	public String fingBook(){
		//return new BookBean().sleep();
		 logger.info("logback-ok");
		System.out.println(bookBean.getAuthor());
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
