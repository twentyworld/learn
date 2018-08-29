package com.inteceptor.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by teemper on 2018/8/29, 22:14.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
@Service
public class TestService {

    @Autowired
    ThreadLocal<Date> threadLocal;

    public String test() {
        threadLocal.set(new Date(1535552738328L));
        return "test";
    }

}
