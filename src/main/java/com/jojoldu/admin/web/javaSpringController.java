package com.jojoldu.admin.web;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class javaSpringController {
    @GetMapping("/javaSpring")
    public String javaSpring(){
        return "javaSpring";
    }
}