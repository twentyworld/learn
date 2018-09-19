package com.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by temper on 2018/5/28,下午4:44.
 * copy as you like, but with these word.
 * at last, The forza horizon is really fun, buy is made, looking forward to driving together in the hurricane.
 */

@RestController
public class HelloController {

    @GetMapping("/test/{hello}")
    public String test(@PathVariable("hello") String hello) {
        return hello + "world";
    }
}
