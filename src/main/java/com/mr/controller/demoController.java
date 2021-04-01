package com.mr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Air on 2021/3/12.
 */
@RestController
public class demoController {
    @GetMapping("/test")
    String demo2(){
        System.out.println("13123d");
        return "尹轩最帅";
    }
}
