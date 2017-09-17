package com.example.configuration;

import com.example.entity.Account;

import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by teemper on 2017/9/17, 20:42.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    private AccountService service;

    @Autowired
    public WebSecurityConfiguration(AccountService service) {
        this.service = service;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(buildUserDetailsService());
    }

    @Bean
    UserDetailsService buildUserDetailsService() {
        return username -> {
            Account account = service.getAccountByName(username);
            return  new User(account.getName(), account.getPassword(),
                    true, true, true, true,
                    AuthorityUtils.createAuthorityList("USER", "write"));
        };
    }

}
