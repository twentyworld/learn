package com.concurrent;

import com.concurrent.thread.PhaserThread;

import java.util.concurrent.Phaser;

/**
 * Created by teemper on 2018/3/3, 17:40.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class PhaserLearn {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);

        PhaserThread system = new PhaserThread("C:\\Windows", "log", phaser);
        PhaserThread apps = new PhaserThread("C:\\Program Files", "log", phaser);
        PhaserThread documents = new PhaserThread("C:\\Documents And Settings", "log", phaser);

        Thread systemThread = new Thread(system, "System");
        systemThread.start();
        Thread appsThread = new Thread(apps, "Apps");
        appsThread.start();
        Thread documentsThread = new Thread(documents, "Documents");
        documentsThread.start();

        try {
            systemThread.join();
            appsThread.join();
            documentsThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Terminated: %s\n", phaser.isTerminated());
    }
}
