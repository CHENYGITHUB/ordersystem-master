package com.guangdong.ordersystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

    @RequestMapping("/")
    public String test(){
        return "canzhuo";
    }
}
