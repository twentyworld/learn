package com;

import com.learn.Id;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by teemper on 2018/7/4, 0:16.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class test {
    @Test
    public void test1() {

        RestTemplate template = new RestTemplate();
        Id id = new Id(2, "id");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity<Id> request = new HttpEntity<>(id,headers);

        ResponseEntity<String> entity = template.exchange("http://localhost:8080/test", HttpMethod.POST,request, String.class);
        System.out.println(entity.getBody());

    }
}
