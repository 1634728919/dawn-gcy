package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class HelloController {
    @Autowired
    private Girl girl;
    @Value("${cupSize}")
    private String cupSize;
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String Hello(){
        //return "Hello World！";
       // return "亲爱的"+name+"同学，你的年纪有"+age+"了，但是你的罩杯才是"+cupSize;
        return girl.getName()+"---"+girl.getAge()+"---"+girl.getCupSize();
    }
}
