package com.example.demo.Controller.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/hello")
    @ResponseBody
    //include get request parameter and return the same
    public String hello(@RequestParam String name) {

        byte b = 127;
        int num=3;
        int num1=5;
        int result = num + num1;
        System.out.println("hello");
        System.out.println(result);
        return "Hello, " + name + "!";


    }
}

