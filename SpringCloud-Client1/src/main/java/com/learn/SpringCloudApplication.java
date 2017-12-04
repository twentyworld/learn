package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teemper on 2017/12/3, 18:37.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class,args);
    }

    @RequestMapping(value = "sayHello",method = RequestMethod.GET,produces = "application/json")
    public String SayHello(){
        return "Hello client1";
    }
}
