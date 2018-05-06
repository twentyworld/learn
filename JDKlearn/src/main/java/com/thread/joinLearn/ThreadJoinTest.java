package com.thread.joinLearn;

/**
 * Created by teemper on 2018/5/6, 20:50.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class ThreadJoinTest {
    public static void main(String[] args) {
        System.out.println("主线程开启...");
        Thread thread1 = new Thread(new PluginFirst());
        Thread thread2 = new Thread(new PluginSecond());
        try {
            thread1.start();   //开始插件1的安装
            thread1.join();       //等插件1的安装线程结束
            thread2.start();   //再开始插件2的安装
            thread2.join();       //等插件2的安装线程结束,才能回到主线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束，程序安装完成！");
    }
}
