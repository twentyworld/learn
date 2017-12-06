package com.learn.mapper;

import com.learn.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by teemper on 2017/12/6, 20:18.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@Component
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    List<User> findByName(@Param("name")String name);

    @Select("SELECT * FROM USER WHERE ID = #{id}")
    User findById(@Param("id")int id);

    @Insert("insert into user(id,name) VALUES (#{id},#{name})")
    int insertUser(@Param("id")int id,@Param("name")String name);

    @Insert("insert into user(id,name) VALUES (#{id},#{name})")
    int insertUserByObject(User user);


}
