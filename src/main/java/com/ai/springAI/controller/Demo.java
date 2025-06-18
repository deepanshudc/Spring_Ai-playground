package com.ai.springAI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api")
public class Demo {

    @RequestMapping(value = "/demo", method = RequestMethod.GET, produces = "application/json")
    public String demo() {
        return "hello world";
    }


}
