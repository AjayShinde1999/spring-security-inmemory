package com.springsecurityinmemory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/no/auth")
public class NoAuthController {

    @GetMapping("/message")
    public String welcome(){
        return "Spring Security No Auth";
    }
}
