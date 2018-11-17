package com.threadPool.threadPoolExecutor;

/**
 * Created by teemper on 2018/7/15, 20:14.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class WorkerThread implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread:" + Thread.currentThread().getName() + "is finished.");
    }
}
