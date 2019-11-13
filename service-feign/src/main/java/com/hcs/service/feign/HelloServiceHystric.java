package com.hcs.service.feign;

import org.springframework.stereotype.Component;

/**
 * @description: 需要用@Component注解注入到Ioc容器中
 * @author: hcs
 * @date: 2018/10/31 23:35
 */
@Component
public class HelloServiceHystric implements HelloService {

    @Override
    public String hiFromSample(String name) {
        return "sorry " + name;
    }
}
