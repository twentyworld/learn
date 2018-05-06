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
public class InterruptedThreadLearn {
    public static void main(String[] args) {
        InterruptThread printer = new InterruptThread();
        Thread printerThread = new Thread(printer, "打印线程");
        printerThread.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("有紧急任务出现，需中断打印线程.");
        System.out.println("中断前的状态: printerThread.isInterrupted()=" + printerThread.isInterrupted());
        printerThread.interrupt();       // 中断打印线程
        System.out.println("中断后的状态：printerThread.isInterrupted()=" + printerThread.isInterrupted());
    }
}
