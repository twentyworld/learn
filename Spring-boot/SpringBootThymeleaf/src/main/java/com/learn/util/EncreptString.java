package com.learn.util;

/**
 * Created by teemper on 2018/4/17, 23:17.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class EncreptString {
    public static long encrept(String name) {
        byte[] chars = name.getBytes();
        int result = 0;
        for (byte c:chars) {
            int temp = c;
            result += temp;
        }
        return result;
    }
}
