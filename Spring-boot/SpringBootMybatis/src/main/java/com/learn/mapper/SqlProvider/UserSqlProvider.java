package com.learn.mapper.SqlProvider;

/**
 * Created by teemper on 2017/12/8, 19:33.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class UserSqlProvider {
    public String sql(String name){
        return "SELECT name as names FROM USER WHERE NAME = "+name;
    }
}
