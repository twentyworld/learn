package com.example;

import com.example.entity.Account;
import com.example.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

/**
 * Created by teemper on 2017/9/15, 19:07.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

    @Bean
    CommandLineRunner init(AccountRepository accountRepository) {
        return (args) -> {
            List<String> names = Arrays.asList(
                    "11,22,33".split(","));
            for(String name: names) {
                accountRepository.save(new Account("password",name,23));
            }
        };
    }

}
