package com.tiger.chat.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements InitializingBean {
    /**
     * 判断Controller是否被正确加载
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("============================================================HelloController is loaded!");
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
