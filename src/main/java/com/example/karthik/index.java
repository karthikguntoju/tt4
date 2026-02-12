package com.example.karthik;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "index";
    }
}
