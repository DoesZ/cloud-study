package com.does.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangkd
 * @date 2019/7/18 17:54
 * @desc
 */
@FeignClient(value = "EUREKA-CLIENT",fallback = FeignServiceHystrix.class)
public interface FeignService {

    /**
     * feign
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/hi")
    String sayHi(@RequestParam(value = "name") String name);
}
