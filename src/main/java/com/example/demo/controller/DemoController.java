package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String index(){
        return "index"; // go to index.html
    }

    @GetMapping("/hello")
    public String Hello(){
        return "hello"; // go to hello.html
    }

    @GetMapping("/hidden-page")
    public String hiddenPage() {
        return "hidden-page";
    }




}
