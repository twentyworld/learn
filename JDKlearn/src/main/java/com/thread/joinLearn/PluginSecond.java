package com.thread.joinLearn;

/**
 * Created by teemper on 2018/5/6, 20:48.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class PluginSecond implements Runnable {

    @Override
    public void run() {
        System.out.println("插件2开始安装.");
        System.out.println("安装中...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("插件2完成安装.");
    }

}
