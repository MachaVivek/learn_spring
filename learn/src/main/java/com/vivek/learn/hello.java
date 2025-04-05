package com.vivek.learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping
    public String helloFunction(){
        return "Hello world it is working";
    }
}

