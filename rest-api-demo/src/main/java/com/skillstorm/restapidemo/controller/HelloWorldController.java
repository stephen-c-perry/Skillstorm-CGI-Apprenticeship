package com.skillstorm.restapidemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloWorldController {
@GetMapping("/hello")
public String getMethodName(@RequestParam String param) {
    return new String();
}

    public String hello(){
        return "Hello there!";
    }

}
