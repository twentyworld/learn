package com.mockito.voidMethodTest; 


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.mockito.Mockito;

/** 
* Sender Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 10, 2017</pre> 
* @version 1.0 
*/ 
public class SenderTest { 


    Sender sender
@Before
public void before() throws Exception {
        sender = new Sender();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: send() 
* 
*/ 
@Test
public void testSend() throws Exception { 

    Emailer emailer = Mockito.mock(Emailer.class);
    when(emailer.send(any())).thenReturn();
} 


} 
