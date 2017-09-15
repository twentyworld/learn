package com.example.repository;

import com.example.entity.User;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by teemper on 2017/9/15, 19:33.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public interface UserRepository extends Repository<User,Integer> {
    public User save(User user);
    public User findById(int id);
    public List<User> findAll();
}
