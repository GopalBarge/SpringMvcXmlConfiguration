package com.poc.service;

public class HelloServiceImpl implements HelloService{
    @Override
    public String getHelloMessage(String text) {
        return "Hello from "+text;
    }
}
