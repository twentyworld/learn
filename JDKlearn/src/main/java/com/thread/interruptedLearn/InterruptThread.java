package com.thread.interruptedLearn;

/**
 * Created by teemper on 2018/5/6, 20:55.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class InterruptThread implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {     //如果当前线程未被中断，则执行打印工作
            System.out.println(Thread.currentThread().getName() + "打印中… …");

        }
        if (Thread.currentThread().isInterrupted()) {
            System.out.println("interrupted:" + Thread.interrupted());       //返回当前线程的状态，并清除状态
            System.out.println("isInterrupted:" + Thread.currentThread().isInterrupted());
        }
    }
}
