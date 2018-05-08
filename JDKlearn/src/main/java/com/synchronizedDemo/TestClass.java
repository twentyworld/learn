package com.synchronizedDemo;

import com.synchronizedDemo.thread.SynchronizedThreadA;
import com.synchronizedDemo.thread.SynchronizedThreadB;
import com.synchronizedDemo.thread.SynchronizedThreadC;
import com.synchronizedDemo.thread.SynchronizedThreadD;

/**
 * Created by temper on 2018/5/6,上午4:40.
 * copy as you like, but with these word.
 * at last, The forza horizon is really fun, buy is made, looking forward to driving together in the hurricane.
 */
public class TestClass {
    public static void main(String[] args) {

        Message object1 = new Message();
        Message object2 = new Message();
        Message object3 = new Message();
        Message object4 = new Message();


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
