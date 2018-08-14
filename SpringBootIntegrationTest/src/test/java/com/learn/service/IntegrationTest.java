package com.learn.service;

import com.learn.SpringBootMybatisApplication;
import com.learn.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by teemper on 2018/8/14, 22:54.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = SpringBootMybatisApplication.class)
@ActiveProfiles("test")
@TestPropertySource(locations = {"classpath:test/application-test.properties"})
public class IntegrationTest {
    @Autowired
    UserService service;

    @Test
    @Sql({"classpath:test/schema.sql", "classpath:test/data.sql"})
    public void testGetUserById() {
        User user = service.getUserById(1);
        Assert.assertTrue(user.getName().equals("mockName1"));
    }
}
