package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by teemper on 2017/12/3, 18:37.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class,args);
    }
}
