package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by teemper on 2017/9/15, 20:27.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@Controller
public class UserController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
