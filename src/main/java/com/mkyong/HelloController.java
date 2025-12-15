package com.mkyong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    String hello() {
		 System.out.println("hello banglore");
        System.out.println("hello sravani");
        return "Hello World, Spring Boot!";
    }

}