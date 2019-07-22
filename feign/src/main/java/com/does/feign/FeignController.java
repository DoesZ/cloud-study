package com.does.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangkd
 * @date 2019/7/18 17:58
 * @desc
 */
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam String name) {
        return feignService.sayHi(name);
    }


}
