package com.example.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Productapp {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to Product Home page";
    }
    @PostMapping("/add")
    public String  add(){
        return "Adding Product";
    }
    @PostMapping("/search")
    public String search(){
        return "Searching Product";
    }


}
