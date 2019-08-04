package com.westar.db2.service;

import com.westar.db2.mapper.UserMapper;
import com.westar.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    public void addUser(User user){
        userMapper.addUser(user.getName(),user.getBirthDay());
    }
}
