package com.learn;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by teemper on 2017/12/7, 14:31.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class DoorManager {
    private Collection<DoorListener> listeners;

    /**
     * 添加事件
     *
     * @param listener
     *            DoorListener
     */
    public void addDoorListener(ListenerImpl listener) {
        if (listeners == null) {
            listeners = new HashSet<>();
        }
        listeners.add(listener);
    }

    /**
     * 移除事件
     *
     * @param listener
     *            DoorListener
     */
    public void removeDoorListener(DoorListener listener) {
        if (listeners == null)
            return;
        listeners.remove(listener);
    }

    /**
     * 触发开门事件
     */
    protected void fireWorkspaceOpened() {
        if (listeners == null)
            return;
        DoorEvent event = new DoorEvent( "open");
        notifyListeners(event);
    }

    /**
     * 触发关门事件
     */
    protected void fireWorkspaceClosed() {
        if (listeners == null)
            return;
        DoorEvent event = new DoorEvent("close");
        notifyListeners(event);
    }

    /**
     * 通知所有的DoorListener
     */
    private void notifyListeners(DoorEvent event) {
        for (DoorListener listener : listeners) {
            listener.doorEvent(event);
        }
    }
}
