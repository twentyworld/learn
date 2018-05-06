package com.synchronizedDemo;

import com.synchronizedDemo.thread.SynchronizedThreadA;
import com.synchronizedDemo.thread.SynchronizedThreadB;
import com.synchronizedDemo.thread.SynchronizedThreadC;

/**
 * Created by teemper on 2018/5/6, 21:27.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class SynchronizedInstanceTest {
    public static void main(String[] args) {
        TestObject object1 = new TestObject();

        for (int i = 0;i<3 ;i++) {
            new Thread(new SynchronizedThreadA(object1)).start();
        }

        for (int i = 0;i<3 ;i++) {
            new Thread(new SynchronizedThreadB(object1)).start();
        }

        for (int i = 0;i<3 ;i++) {
            new Thread(new SynchronizedThreadC(object1)).start();
        }

    }
}
