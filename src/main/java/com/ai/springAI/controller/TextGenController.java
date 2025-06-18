package com.ai.springAI.controller;

import com.ai.springAI.service.DeepseekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ai")
public class TextGenController {

    @Autowired
    private DeepseekService service;

//    @GetMapping("/askDeepSeek")
//    public String ask(@RequestParam String question) {
//        chatModel.call(question);
//        return chatModel.call(question);
//    }

    @GetMapping("/askDeepSeek")
    public String ask(@RequestParam String question) {
       return service.askDeepSeek(question);
    }



}
