package com.hcs.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: 使用@FeignClient("服务名")注解，来指定调用哪个服务
 * @author: hcs
 * @date: 2018/10/31 23:22
 */
@FeignClient(value = "eureka-client", fallback = HelloServiceHystric.class)
public interface HelloService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hiFromSample(@RequestParam(value = "name") String name);
}
