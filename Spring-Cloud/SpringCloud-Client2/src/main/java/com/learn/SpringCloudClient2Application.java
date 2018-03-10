package com.learn;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teemper on 2017/12/3, 18:37.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudClient2Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClient2Application.class,args);
    }

    @RequestMapping(value = "sayHello",method = RequestMethod.GET,produces = "application/json")
    public String SayHello(){
        return "Hello client2";
    }

    @Bean
    public Integer port(){
        return SocketUtils.findAvailableTcpPort();
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
        return tomcat;
    }

    private Connector createStandardConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(port());
        return connector;
    }
}