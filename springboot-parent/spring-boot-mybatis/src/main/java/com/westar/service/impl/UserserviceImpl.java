package com.westar.service.impl;

import com.github.pagehelper.PageHelper;
import com.westar.dao.UserDao;
import com.westar.mapper.UserMapper;
import com.westar.pojo.User;
import com.westar.pojo.UserExample;
import com.westar.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserserviceImpl implements Userservice {

    @Autowired
    private UserMapper userMapper;

    public void addUser(User user){
        userMapper.addUser(user);
    }

    @Override
    public List<User> findUsers(int page, int row) {
        UserExample userExample = new UserExample();
        PageHelper.startPage(page,row);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }
}
