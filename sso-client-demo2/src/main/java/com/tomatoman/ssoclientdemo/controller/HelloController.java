package com.tomatoman.ssoclientdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("hello")
    public String hello() {
        return "Hello CAS";
    }

    @RequestMapping("/")
    public String helloCas() {
        return "index";
    }
}
