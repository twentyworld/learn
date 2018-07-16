package com.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by teemper on 2018/7/15, 20:13.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class FixedThreadExecutorLearn {
    public static void main(String[] args) {
        //newFixedThreadPool
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0 ;i< 20;i++) {
            Thread thread = new Thread(new WorkerThread(), "thread:"+i);
            service.execute(thread);
        }
        service.shutdown();
    }
}
