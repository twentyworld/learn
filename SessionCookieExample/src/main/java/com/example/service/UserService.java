package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by teemper on 2017/9/15, 19:36.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public User getUserById(int id){
        return repository.findById(id);
    }
    public User save(User user){
        return repository.save(user);
    }

    public List<User> getAll(){
        return repository.findAll();
    }

}
