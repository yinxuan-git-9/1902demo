package com.mr.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Air on 2021/3/12.
 */
@RestController
public class TestController {

    @RequestMapping("/testMethod")
    String home(){
        return "hello world";
    }
}
