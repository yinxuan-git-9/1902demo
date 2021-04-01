package com.mr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Air on 2021/3/12.
 */
@SpringBootApplication
@MapperScan("com.mr.mapper")
public class Application {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(Application.class,args);
    }
}
