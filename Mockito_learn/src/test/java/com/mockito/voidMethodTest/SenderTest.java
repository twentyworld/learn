package com.mockito.voidMethodTest;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.mockito.*;

import java.util.ArrayList;
import java.util.List;

//@RunWith(MockitoJUnitRunner.class)
public class SenderTest extends SampleBaseTestCase {
    //private Emailer emailer = Mockito.mock(Emailer.class);
    //@Mock private User user;
    //@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
    private User user_instance = new User(12,"12");


    @Mock Id id = mock(Id.class);
    @Mock String string;
    //@Mock Account account;
    @Spy private User user = spy(user_instance);
    @Mock  private Emailer emailer;
    @InjectMocks private Sender sender = new Sender(id);
    @Before public void before() throws Exception {
        when(id.getId()).thenReturn("that");
        //when(sender.getNaming()).thenReturn(getId());
        when(string.toLowerCase()).thenReturn("lower");
    }

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

//    public List<Id> getId(){
//        List<Id> list = new ArrayList<>();
//        list.add(new Id("id"));
//        return list;
//    }

}

class SampleBaseTestCase {

    @Before public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
}