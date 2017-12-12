package com.learn;

/**
 * Created by teemper on 2017/12/7, 13:51.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class DoorEvent{
    private static final long serialVersionUID = 6496098798146410884L;

    private String doorState = "";// 表示门的状态，有“开”和“关”两种

    public DoorEvent( String doorState) {
        this.doorState = doorState;
    }

    public void setDoorState(String doorState) {
        this.doorState = doorState;
    }

    public String getDoorState() {
        return this.doorState;
    }

}
