package com.mockito.voidMethodTest; 

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.mockito.*;
//@RunWith(MockitoJUnitRunner.class)
public class SenderTest extends SampleBaseTestCase {
    //private Emailer emailer = Mockito.mock(Emailer.class);
    //@Mock private User user;
    //@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
    private User user_instance = new User(12,"12");

    @Spy private User user = spy(user_instance);
    @Mock  private Emailer emailer;
    @InjectMocks private Sender sender = new Sender();
    @Before public void before() throws Exception { }

    @After public void after() throws Exception { }
    /**
     * Method: send()
     */
    @Test
    public void testSend() throws Exception {
        //when(user.toString()).thenReturn("this");
        //sender.setUser(new User(sender.getUser().getId()+1,sender.getUser().getName()));
        sender.send();
        verify(emailer).send(anyString());
        //verify(emailer,never()).send(anyString());
    }

}

class SampleBaseTestCase {

    @Before public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
}