package com.westar.mapper;

import com.westar.pojo.User;
import com.westar.pojo.UserExample;

import java.util.List;

/**
 * 可以使用注解形式@INsert等
 */
public interface UserMapper {
    void addUser(User user);

    List<User> selectByExample(UserExample userExample);
}
