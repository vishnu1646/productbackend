package com.example.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Productapp {
    @GetMapping("/")
    private String Homepage(){
        return "Welcome to Product Home page";
    }



}
