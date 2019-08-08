package com.westar.pojo;

import org.springframework.security.core.userdetails.User;

import java.util.Collections;

public class MyUserDetails extends User {

    private UserInfo userInfo;

    public MyUserDetails(UserInfo userInfo) {
        super(userInfo.getUserName(), userInfo.getPassword(), true, true, true, true, Collections.EMPTY_SET);
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
