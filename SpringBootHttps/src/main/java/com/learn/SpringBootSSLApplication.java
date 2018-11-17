package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teemper on 2018/6/18, 21:03.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */

@SpringBootApplication
@RestController
public class SpringBootSSLApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSSLApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


}
