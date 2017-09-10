package com.mockito.voidMethodTest; 

import static org.mockito.Mockito.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

/** 
* Sender Tester.
* @author <Authors name>
* @since <pre>���� 10, 2017</pre>
        * @version 1.0
        */

public class SenderTest {
    @Mock private Emailer emailer;
    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
    @InjectMocks private Sender sender;

    @Before public void before() throws Exception { }

    @After public void after() throws Exception { }
    /**
     * Method: send()
     */
    @Test
    public void testSend() throws Exception {
        sender.send();
        verify(emailer).send(anyString());
    }
}