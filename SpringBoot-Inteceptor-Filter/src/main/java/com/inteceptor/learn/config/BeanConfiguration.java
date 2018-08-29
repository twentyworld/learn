package com.inteceptor.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * Created by teemper on 2018/8/29, 22:14.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public ThreadLocal<Date> threadLocal() {
        return new ThreadLocal<>();
    }

}
