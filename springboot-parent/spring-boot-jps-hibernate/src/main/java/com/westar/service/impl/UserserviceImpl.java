package com.westar.service.impl;

import com.westar.dao.UserDao;
import com.westar.pojo.User;
import com.westar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserserviceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.save(user);
    }
}
