package com.example.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
@GetMapping
    public String getHelloWro(){

        return "Welcome to the rest api";

    }



}
