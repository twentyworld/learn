package com.learn.service;

import com.learn.domain.User;
import com.learn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by teemper on 2018/8/14, 22:03.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
@Service
public class UserService {

    private UserMapper mapper;

    @Autowired
    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }

    public User getUserById(int id) {
        return mapper.findById(id);
    }
}
