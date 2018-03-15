package com.helloworld.springbootexample;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
    @RequestMapping("/")
    public String showHome(){
        return "Hello world from spring boot";
    }
}
