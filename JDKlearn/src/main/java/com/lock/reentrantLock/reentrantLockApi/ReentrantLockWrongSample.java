package com.lock.reentrantLock.reentrantLockApi;

import com.lock.reentrantLock.reentrantLockApi.thread.WrongSampleThread;

import java.util.ArrayList;

/**
 * Created by teemper on 2018/5/7, 21:49.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class ReentrantLockWrongSample {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        WrongSampleThread thread1 = new WrongSampleThread(arrayList);
        WrongSampleThread thread2 = new WrongSampleThread(arrayList);

        new Thread(thread1).start();
        new Thread(thread1).start();
        new Thread(thread2).start();
        new Thread(thread2).start();

    }
}
