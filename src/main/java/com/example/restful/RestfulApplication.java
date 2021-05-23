package com.example.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestfulApplication {

    @GetMapping("/message")
    public String message(){
        return "IT LIVES???";
    }

    public static void main(String[] args) {
        SpringApplication.run(RestfulApplication.class, args);
    }

}
