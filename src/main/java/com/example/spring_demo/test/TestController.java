package com.example.spring_demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/t1")
    public String t1(HttpServletRequest request) {
        int interval = request.getSession().getMaxInactiveInterval();
        return String.valueOf(interval);
    }
}
