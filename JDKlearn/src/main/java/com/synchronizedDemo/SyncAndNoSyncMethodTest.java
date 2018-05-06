package com.synchronizedDemo;

import com.synchronizedDemo.thread.SynchronizedThreadA;
import com.synchronizedDemo.thread.SynchronizedThreadD;

/**
 * Created by teemper on 2018/5/6, 21:45.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class SyncAndNoSyncMethodTest {
    public static void main(String[] args) {
        Message message = new Message();

        for (int i = 0; i < 3; i++) {
            new Thread(new SynchronizedThreadA(message)).start();
        }

        for (int i = 0; i < 10000; i++) {
            new Thread(new SynchronizedThreadD(message)).start();
        }

    }
}
