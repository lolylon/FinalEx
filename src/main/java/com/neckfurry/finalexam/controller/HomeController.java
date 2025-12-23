package com.neckfurry.finalexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/info")
    public String getInfo() {
        return "Final Exam Project";
    }

    @GetMapping("/status")
    public String getStatus() {
        return "Application is running!";
    }
}