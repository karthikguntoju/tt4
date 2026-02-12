package com.example.karthik;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index {

    @GetMapping("/hello")
    public String hello() {
        return "index";
    }
}
