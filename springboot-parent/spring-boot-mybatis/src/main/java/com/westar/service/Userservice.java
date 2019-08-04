package com.westar.service;

import com.westar.dao.UserDao;
import com.westar.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Userservice {

    void addUser(User user);

    List<User> findUsers(int page, int row);
}
