package com.example.test01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	private static final String template = "Hello, %s!";

	/*
	 * http://localhost:8080/greeting?name=Juan_Pablo
	 * http://localhost:8080/greeting
	 */
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	System.out.println("Received greeting call, parameter [name]: '" + name + "'!!!");
        return String.format(template, name);
    }

}
