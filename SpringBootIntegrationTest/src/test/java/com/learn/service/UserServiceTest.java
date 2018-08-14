package com.learn.service;

import com.learn.domain.User;
import com.learn.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 * UserService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 14, 2018</pre>
 */
public class UserServiceTest {

    private UserService service;

    private UserMapper mapper = Mockito.mock(UserMapper.class);

    @Before
    public void before() throws Exception {
        service = new UserService(mapper);

    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getUserById(int id)
     */
    @Test
    public void testGetUserById() throws Exception {
        User mock = new User(1,"name");
        Mockito.when(mapper.findById(Mockito.anyInt())).thenReturn(mock);

        User user = service.getUserById(1);

        Assert.assertTrue(user.getName().equals("name"));
    }

} 
