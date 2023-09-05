package com.springsecurityinmemory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class ApplicationController {

    @GetMapping("/message")
    public String welcome(){
        return "Spring Security In Memory";
    }
}
