package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.DemoServiceInfc;

/**
 * 实现类
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoServiceInfc {
    @Override
    public String printName(String name) {
        String sayHello = "Hello %s,I am provider,welcome !";
        return String.format(sayHello,name);
    }
}
