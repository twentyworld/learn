package com.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teemper on 2018/7/4, 0:01.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */

@RestController
public class TestController {

    @Logger
    @PostMapping("/test")
    public String test(@RequestBody Id id) {
        return id.toString();
    }


}
