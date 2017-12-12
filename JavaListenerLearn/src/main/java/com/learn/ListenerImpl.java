package com.learn;

/**
 * Created by teemper on 2017/12/7, 14:32.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class ListenerImpl implements DoorListener{
    @Override
    public void doorEvent(DoorEvent event) {
        // TODO Auto-generated method stub
        if (event.getDoorState() != null && event.getDoorState().equals("open")) {
            System.out.println("门1打开");
        } else {
            System.out.println("门1关闭");
        }
    }
}
