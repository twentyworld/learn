package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teemper on 2017/12/16, 16:16.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@RestController
public class SpringCloudConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerApplication.class,args);
    }
}
