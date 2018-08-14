package com.learn;

import com.learn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Created by teemper on 2017/12/6, 19:57.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */
@SpringBootApplication
public class SpringBootMybatisApplication implements CommandLineRunner {
    @Autowired
    public SpringBootMybatisApplication(UserMapper mapper) {
        this.mapper = mapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }

    private UserMapper mapper;
    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
//        mapper.insertUser(1,"name");
//        mapper.insertUser(2,"name2");
    }
}
