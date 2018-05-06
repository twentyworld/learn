package com.synchronizedDemo;

import com.synchronizedDemo.thread.SynchronizedThreadA;
import com.synchronizedDemo.thread.SynchronizedThreadB;

/**
 * Created by teemper on 2018/5/6, 21:56.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class SyncDiffInstanceTest {
    public static void main(String[] args) {
        Message message1 = new Message();
        Message message2 = new Message();
        for (int i = 0;i<3 ;i++) {
            new Thread(new SynchronizedThreadA(message1)).start();
        }
        for (int i = 0;i<3 ;i++) {
            new Thread(new SynchronizedThreadB(message2)).start();
        }
    }
}
