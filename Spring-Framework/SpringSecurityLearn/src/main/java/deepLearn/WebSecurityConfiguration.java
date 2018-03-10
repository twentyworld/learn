package deepLearn;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by teemper on 2018/3/6, 20:27.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */

/**
 *
 You can find a summary of the features below:

     Require authentication to every URL in your application
     Generate a login form for you
     Allow the user with the Username user and the Password password to authenticate with form based authentication
     Allow the user to logout
     CSRF attack prevention
     Session Fixation protection
     Security Header integration

     HTTP Strict Transport Security for secure requests
     X-Content-Type-Options integration
     Cache Control (can be overridden later by your application to allow caching of your static resources)
     X-XSS-Protection integration
     X-Frame-Options integration to help prevent Clickjacking
     Integrate with the following Servlet API methods

     HttpServletRequest#getRemoteUser()
     HttpServletRequest.html#getUserPrincipal()
     HttpServletRequest.html#isUserInRole(java.lang.String)
     HttpServletRequest.html#login(java.lang.String, java.lang.String)
     HttpServletRequest.html#logout()

 */

@EnableWebSecurity
public class WebSecurityConfiguration implements WebMvcConfigurer {



    @Bean
    public UserDetailsService userDetailsService() throws Exception {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build());
        return manager;
    }
}
