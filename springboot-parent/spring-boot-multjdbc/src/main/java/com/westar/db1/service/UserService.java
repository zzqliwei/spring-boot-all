package com.westar.db1.service;

import com.westar.db1.mapper.UserMapper;
import com.westar.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void addUser(User user){
        userMapper.addUser(user.getName(),user.getBirthDay());
    }
}
