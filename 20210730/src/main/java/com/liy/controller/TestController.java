package com.liy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello/{abc}/{bcde}")
    public String test(@PathVariable String abc, @PathVariable String bcde){
        return "hello world springboot!"+abc+":"+bcde;
    }
}
