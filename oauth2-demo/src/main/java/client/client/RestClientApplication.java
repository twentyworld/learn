package client.client;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * Created by teemper on 2018/9/12, 13:53.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */

@SpringBootApplication
@PropertySource("client.properties")
public class RestClientApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(RestClientApplication.class, args);
    }

    @Autowired
    RestTemplate template;

    @Bean
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }

    @Override
    public void run(String... args) throws Exception {

        getPublicData();

        getPrivateMessage();
    }

    private void getPublicData() {
        System.out.println(template.getForObject("http://localhost:9090/api/data", String.class));
    }

    private void getPrivateMessage() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization","Bearer "+getToken());

        MultiValueMap<String, String> params= new LinkedMultiValueMap<>();
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);

        ResponseEntity<String> response=  template.exchange("http://localhost:9090/private/data", HttpMethod.GET,requestEntity,String.class);

        System.out.println(response.getBody());

    }

    private String getToken() {
        String url = "http://localhost:8090/oauth/token?grant_type=client_credentials&scope=select&client_id=client_1&client_secret=123456";

        String result = template.getForObject(url, String.class);
        String token = null;
        try {
             token = new ObjectMapper().readTree(result).get("access_token").asText();
        } catch (IOException e) {
            //print the error
            //throw the error is need.
            e.printStackTrace();
        }
        return token;
    }





}
