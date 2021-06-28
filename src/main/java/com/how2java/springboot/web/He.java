package com.how2java.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class He {
    @RequestMapping("/zeng")
    public String zeng(){
        return "444449";
    }
}
