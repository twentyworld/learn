package com.inteceptor.learn.controller;

import com.inteceptor.learn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
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

@RestController
public class TestController {

    @Autowired
    TestService service;

    @GetMapping(path = "/test", produces = "application/json")
    public String test() {
        return service.test();
    }


}
