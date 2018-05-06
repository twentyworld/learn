package com.synchronizedDemo;

import com.synchronizedDemo.thread.SynchronizedThreadE;
import com.synchronizedDemo.thread.SynchronizedThreadG;

/**
 * Created by teemper on 2018/5/7, 0:30.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class SyncClassTest {
    public static void main(String[] args) {
        Message message1 = new Message();
        Message message2 = new Message();

        for (int i = 0; i < 3; i++) {
            new Thread(new SynchronizedThreadE(message1)).start();
        }
        for (int i = 0; i < 3; i++) {
            new Thread(new SynchronizedThreadG(message1)).start();
        }
        for (int i = 0; i < 3; i++) {
            new Thread(new SynchronizedThreadG(message2)).start();
        }
    }
}
