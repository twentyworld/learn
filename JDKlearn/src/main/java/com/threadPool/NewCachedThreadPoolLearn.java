package com.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by teemper on 2018/7/15, 20:25.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class NewCachedThreadPoolLearn {
    public static void main(String[] args) {
        //newFixedThreadPool
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0 ;i< 20;i++) {
            Thread thread = new Thread(new WorkerThread(), "thread:"+i);
            service.execute(thread);
        }
        service.shutdown();
    }
}
