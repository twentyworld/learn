package com.learn;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;

/**
 * Created by teemper on 2017/12/3, 18:37.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class,args);
    }

    @Bean
    public RestTemplate restTemplates(){
        return new RestTemplate(clientHttpRequestFactory());
    }

    @Bean
    public ClientHttpRequestFactory clientHttpRequestFactory(){
        KeyStore keyStore = null;
        try {
            keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("C:\\Users\\w\\IdeaProjects\\learn\\SpringCloud-Zuul\\src\\main\\resources\\sample.jks"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            assert keyStore != null;
            keyStore.load(fileInputStream,"secret".toCharArray());
        } catch (IOException | NoSuchAlgorithmException | CertificateException e) {
            e.printStackTrace();
        }

        SSLConnectionSocketFactory sslConnectionSocketFactory = null;
        try {
            sslConnectionSocketFactory = new SSLConnectionSocketFactory(
                    new SSLContextBuilder()
                            .loadTrustMaterial(null,new TrustSelfSignedStrategy())
                            .loadKeyMaterial(keyStore,"password".toCharArray()).build()
                    , NoopHostnameVerifier.INSTANCE);
        } catch (NoSuchAlgorithmException | KeyManagementException | KeyStoreException | UnrecoverableKeyException e) {
            e.printStackTrace();
        }

        CloseableHttpClient closeableHttpClient = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory).build();
        return new HttpComponentsClientHttpRequestFactory(closeableHttpClient);
    }

}
