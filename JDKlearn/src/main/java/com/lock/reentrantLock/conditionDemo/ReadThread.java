package com.lock.reentrantLock.conditionDemo;

/**
 * Created by teemper on 2018/5/8, 23:35.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class ReadThread implements Runnable {

    private ArrayBuffer buffer;

    public ReadThread(ArrayBuffer buffer) {
        this.buffer = buffer;
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
        System.out.println("read running.");
        for (int i =0;i<500;i++) {
            System.out.println("read result:   " + buffer.read());

        }
    }
}
