package com.learn.respository;

import com.learn.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by teemper on 2018/6/16, 23:45.
 *
 * @author Zed.
 * github:https://github.com/twentyworld
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
@Component
public class UserAuthService {

    public User findUserByUsername(String username) {
        if (username.equals("name")) System.out.println("shoot db.");
        return new User(1, "name", "passwd");
    }
}
