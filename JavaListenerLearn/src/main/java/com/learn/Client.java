package com.learn;

/**
 * Created by teemper on 2017/12/7, 14:32.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class Client {
    public static void main(String[] args) {
        DoorManager manager = new DoorManager();
        manager.addDoorListener(new ListenerImpl());// 给门1增加监听器
        manager.addDoorListener(new ListenerImpl2());// 给门2增加监听器
        // 开门
        manager.fireWorkspaceOpened();
        System.out.println("我已经进来了");
        // 关门
        manager.fireWorkspaceClosed();
    }
}
