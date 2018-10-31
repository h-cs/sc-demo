package com.hcs.service.feign;

import org.springframework.stereotype.Component;

/**
 * @description:
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
