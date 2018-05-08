package com.lock.reentrantLock;

import com.lock.reentrantLock.thread.RightSampleThread;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by teemper on 2018/5/7, 21:58.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class ReentrantLockRightSample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Lock lock = new ReentrantLock();    //注意这个地方

        RightSampleThread thread1 = new RightSampleThread(lock, list);
        RightSampleThread thread2 = new RightSampleThread(lock, list);

        new Thread(thread1).start();
        new Thread(thread2).start();


    }


}
