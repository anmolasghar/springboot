package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootController {
    @RequestMapping("/Springboot")
    public String hello(){
        return "Hellow world";
    }
}
