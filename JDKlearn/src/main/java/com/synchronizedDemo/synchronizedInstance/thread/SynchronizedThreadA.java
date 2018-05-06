package com.synchronizedDemo.synchronizedInstance.thread;

import com.synchronizedDemo.synchronizedInstance.TestObject;

/**
 * Created by temper on 2018/5/6,上午4:41.
 * copy as you like, but with these word.
 * at last, The forza horizon is really fun, buy is made, looking forward to driving together in the hurricane.
 */
public class SynchronizedThreadA implements Runnable {


    private TestObject object;

    public SynchronizedThreadA(TestObject object) {
        this.object = object;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        object.methodA();

    }
}
