package com.skaffold.jib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication {

	@RequestMapping(value={"/"})
	public String getRoot(){
		return "welcome to Skaffold";
	}


	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}



