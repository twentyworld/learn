package basicAuth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by teemper on 2018/3/7, 23:39.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors().disable()
                .csrf().disable()
                .authorizeRequests()

//                .antMatchers("/login").permitAll()

                .antMatchers("/test").authenticated()

//                .antMatchers("/success").hasAuthority("USER")

                .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .and()

//                .sessionManagement()
//                .and()

                .logout().permitAll()

                .and()
                .httpBasic()
                .disable()
        ;
    }

//    @Autowired
//    public  void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .passwordEncoder(new MyPass())
//                .withUser("admin").password("admin").roles("USER");
//
////        auth.inMemoryAuthentication()
////                .passwordEncoder(new MyPass())
////                .withUser("user").password("user").roles("ADMIN");
//    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(new MyPass())
                .withUser("admin").password("admin").roles("USER").and()
                .withUser("user").password("user").roles("USER");
    }
}


class MyPass implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return rawPassword.equals(encodedPassword.toLowerCase());
    }
}
