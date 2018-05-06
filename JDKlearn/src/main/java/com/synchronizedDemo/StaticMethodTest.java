package com.synchronizedDemo;

import com.synchronizedDemo.thread.SynchronizedThreadA;
import com.synchronizedDemo.thread.SynchronizedThreadE;
import com.synchronizedDemo.thread.SynchronizedThreadF;

/**
 * Created by teemper on 2018/5/6, 22:47.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class StaticMethodTest {
    public static void main(String[] args) {
        Message message1 = new Message();
        Message message2 = new Message();

        for (int i = 0; i < 3; i++) {
            new Thread(new SynchronizedThreadE(message1)).start();
        }
        for (int i = 0; i < 3; i++) {
            new Thread(new SynchronizedThreadE(message2)).start();
        }
    }
}
