package com.springboot.aws.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringbootAwsPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsPipelineApplication.class, args);
	}
	
	
	@GetMapping("\test")
	public String test()
	{
		return "Hello world";
	}

}
