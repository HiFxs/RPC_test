package com.example.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.graduate.provider.Test;
import com.xiaobai.nettyrpc.consumer.annotations.Remote;




/**
 * @author HiFxs
 * @description:
 * @create: 2023-02-27 12:25
 */

@RestController
public class TestController {
    @Remote(providerAddresses = {"127.0.0.1:1234"},providerName = "provider-demo")
    private Test test;

    @RequestMapping("/test")
    public String test() {
        return test.test("xiaobai");
    }
    @GetMapping("/test2")
    public String h(){
        return "dwqd";
    }


}