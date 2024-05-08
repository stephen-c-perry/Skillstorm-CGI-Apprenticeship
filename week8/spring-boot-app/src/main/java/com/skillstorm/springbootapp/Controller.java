package com.skillstorm.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String[] hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      String[] groceries = {"apples", "bananas", "oranges"};
      return groceries;
    }

}
