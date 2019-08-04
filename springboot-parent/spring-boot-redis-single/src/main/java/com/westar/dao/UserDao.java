package com.westar.dao;

import com.westar.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addUser(User user){
        jdbcTemplate.update("insert into users(name,passwd,email,birthday)values(?,?,?,?)",
                new Object[]{user.getName(),user.getPasswd(),user.getEmail(),user.getBirthDay()});
    }
}
