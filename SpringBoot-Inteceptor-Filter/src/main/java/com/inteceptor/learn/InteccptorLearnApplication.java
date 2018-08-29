package com.inteceptor.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by teemper on 2018/8/29, 22:13.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
@ServletComponentScan
@SpringBootApplication
public class InteccptorLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(InteccptorLearnApplication.class,args);
    }
}
