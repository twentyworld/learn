package com.learn;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;

/**
 * Created by teemper on 2017/12/4, 23:58.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@RestController
public class ZuulController {


    private final RestTemplate restTemplates;

    @Autowired
    public ZuulController(RestTemplate restTemplates) {
        this.restTemplates = restTemplates;
    }

    @GetMapping(value = "/product")
    public String product(){
        return restTemplates.getForObject("https://localhost:8443/sayHello",String.class);
    }
}
