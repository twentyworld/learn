package com.learn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teemper on 2017/12/16, 23:52.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */

@EnableEurekaClient
@SpringBootApplication
@RefreshScope
@RestController
public class SpringCloudConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientApplication.class,args);
    }

    @Value("${spring.application.name}")
    String client1;

    @RequestMapping("/hi")
    public String hi(){
        return client1;
    }
}
