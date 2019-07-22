package com.does.feign;

import org.springframework.stereotype.Component;

/**
 * @author zhangkd
 * @date 2019/7/19 17:13
 * @desc
 */
@Component
public class FeignServiceHystrix implements FeignService {

    @Override
    public String sayHi(String name) {
        return "sorry " + name;
    }
}
