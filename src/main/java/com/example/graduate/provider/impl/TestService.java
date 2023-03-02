package com.example.graduate.provider.impl;

import org.springframework.stereotype.Component;

import com.example.graduate.provider.Test;
import com.xiaobai.nettyrpc.provider.annotations.Service;

/**
 * @author HiFxs
 * @description:
 * @create: 2023-02-27 12:30
 */

@Service
public class TestService implements Test {

    @Override
    public String test(String message) {
        return "hello " + message;
    }
}
