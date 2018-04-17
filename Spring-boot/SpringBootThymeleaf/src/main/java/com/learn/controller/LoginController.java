package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by teemper on 2018/4/17, 21:28.
 *
 * @author Zed.
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@Controller
public class LoginController {
    @RequestMapping("/")
    public String index(Model model) {


        return "index";
    }

}
