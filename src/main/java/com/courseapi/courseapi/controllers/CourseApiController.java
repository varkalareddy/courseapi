package com.courseapi.courseapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseApiController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hi Venkat");
    }
}
