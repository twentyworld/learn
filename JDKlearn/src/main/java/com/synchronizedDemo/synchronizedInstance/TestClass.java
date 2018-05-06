package com.synchronizedDemo.synchronizedInstance;

import com.synchronizedDemo.synchronizedInstance.thread.SynchronizedThreadA;
import com.synchronizedDemo.synchronizedInstance.thread.SynchronizedThreadB;
import com.synchronizedDemo.synchronizedInstance.thread.SynchronizedThreadC;
import com.synchronizedDemo.synchronizedInstance.thread.SynchronizedThreadD;

/**
 * Created by temper on 2018/5/6,上午4:40.
 * copy as you like, but with these word.
 * at last, The forza horizon is really fun, buy is made, looking forward to driving together in the hurricane.
 */
public class TestClass {
    public static void main(String[] args) {

        TestObject object1 = new TestObject();
        TestObject object2 = new TestObject();
        TestObject object3 = new TestObject();
        TestObject object4 = new TestObject();


//        SynchronizedThreadA threadA = new SynchronizedThreadA(object1);
//        SynchronizedThreadB threadB = new SynchronizedThreadB(object2);
//        SynchronizedThreadC threadC = new SynchronizedThreadC(object3);
//        SynchronizedThreadD threadD = new SynchronizedThreadD(object4);



        for (int i = 0;i<3 ;i++) {
            new Thread(new SynchronizedThreadA(object1)).start();
            System.out.println("object1 thread"+i);
        }
        for (int i = 0;i<3 ;i++) {
            new Thread(new SynchronizedThreadB(object1)).start();
            System.out.println("object1 thread"+i);
        }

        for (int i = 0;i<3 ;i++) {
            new Thread(new SynchronizedThreadC(object1)).start();
            System.out.println("object1 thread"+i);
        }



        for (int i = 0; i<3 ;i++) {
            new Thread(new SynchronizedThreadD(object1)).start();
        }


    }
}