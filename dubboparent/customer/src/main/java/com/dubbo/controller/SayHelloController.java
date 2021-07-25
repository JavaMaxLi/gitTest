package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.DemoServiceInfc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping(value = "/customer")
public class SayHelloController {

    @Reference(version = "${demo.service.version}")
    private DemoServiceInfc demoServiceInfc;

    @GetMapping(value = "/sayHello")
    public String sayHello(String name) {
        return demoServiceInfc.printName(name);
    }
}
