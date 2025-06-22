package com.ai.springAI.controller;


import com.ai.springAI.service.DeepseekService;
import com.ai.springAI.service.StabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aiImageGen")
public class ImageGenController {

    @Autowired
    private StabilityService service;

    @RequestMapping(path = "/askStability", produces = "application/json",method = RequestMethod.GET)
    public String generateImage(@RequestParam String prompt) {
        return service.generateImage(prompt);
    }

}
