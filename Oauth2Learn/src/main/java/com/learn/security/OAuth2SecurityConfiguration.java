package com.learn.security;


import com.learn.config.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.approval.ApprovalStore;
import org.springframework.security.oauth2.provider.approval.TokenApprovalStore;
import org.springframework.security.oauth2.provider.approval.TokenStoreUserApprovalHandler;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

/**
 * security配置
 * 
 * @author lxg
 *
 * 2017年2月17日上午11:13:55
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class OAuth2SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private ClientDetailsService clientDetailsService;

//	@Autowired
//	private RedisConnectionFactory redisConnection;

	@Bean
	public MyUserDetailsService myUserDetailsService(){
		return new MyUserDetailsService();
	}
//	@Autowired
//    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//			.userDetailsService(myUserDetailsService())
//			.passwordEncoder(new Md5PasswordEncoder());
//    }


	/**
	 * 在内存中创建两个用户
	 * @param auth
	 * @throws Exception
	 */
	@Autowired
	public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
				.withUser("bill").password("abc123").roles("admin1").and()
				.withUser("bob").password("abc123").roles("USER");
	}

    @Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.anonymous().disable()
				.authorizeRequests()
				.antMatchers("/oauth/token").permitAll();
	}

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }


//	@Bean
//	public TokenStore tokenStore() {
//		return new RedisTokenStore(redisConnection);
//	}

	/**
	 * 实例化一个TokenStore，他的实现是InMemoryTokenStore，会把OAuth授权的token保存在内存中
	 * @return
	 */
	@Bean
	public TokenStore tokenStore() {
		return new InMemoryTokenStore();
	}

	@Bean
	@Autowired
	public TokenStoreUserApprovalHandler userApprovalHandler(TokenStore tokenStore){
		TokenStoreUserApprovalHandler handler = new TokenStoreUserApprovalHandler();
		handler.setTokenStore(tokenStore);
		handler.setRequestFactory(new DefaultOAuth2RequestFactory(clientDetailsService));
		handler.setClientDetailsService(clientDetailsService);
		return handler;
	}
	
	@Bean
	@Autowired
	public ApprovalStore approvalStore(TokenStore tokenStore) throws Exception {
		TokenApprovalStore store = new TokenApprovalStore();
		store.setTokenStore(tokenStore);
		return store;
	}
	
}
