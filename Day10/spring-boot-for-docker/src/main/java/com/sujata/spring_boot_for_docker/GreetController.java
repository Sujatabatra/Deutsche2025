package com.sujata.spring_boot_for_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greet")
    String greet(){
        return "Welcome to the world of Spring Boot!";
    }
}
