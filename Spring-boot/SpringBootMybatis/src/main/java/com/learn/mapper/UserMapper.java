package com.learn.mapper;

import com.learn.SqlProvider.UserSqlProvider;
import com.learn.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

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
    public static final String sql = "SELECT * FROM USER WHERE NAME = #{name}";
    @Select(sql)
    List<User> findByName(@Param("name")String name);

    @SelectProvider(type = UserSqlProvider.class,method = "sql")
    List<Map<String,String>> findNameByName(String name);
    @Select("SELECT * FROM USER WHERE ID = #{id}")
    User findById(@Param("id")int id);
    @Insert("insert into user(id,name) VALUES (#{id},#{name})")
    int insertUser(@Param("id")int id,@Param("name")String name);
    @Insert("insert into user(id,name) VALUES (#{id},#{name})")
    int insertUserByObject(User user);
}
