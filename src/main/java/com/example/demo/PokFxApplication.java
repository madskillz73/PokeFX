package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PokFxApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokFxApplication.class, args);
	}
	
	@GetMapping("/hello")
    public String hello() {
        return "<h1> Hello, world!<h1>";
    }		
 
}
