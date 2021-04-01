package com.mr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Air on 2021/3/12.
 */
@Controller
public class TestTemplates {
    @GetMapping("/testTemp")
     String test4(){
        //相当于视图解析器
        return "/index.html";
    }
}
