package com.westar.service;

import com.westar.dao.UserDao;
import com.westar.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    @Autowired
    private UserDao userDao;

    public void addUser(User user){
        userDao.addUser(user);
    }
}
