package com.westar.service;

import com.westar.dao.UserRepository;
import com.westar.pojo.UserNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUserNode(UserNode userNode){
        userRepository.addUserNodeList(userNode.getName(),userNode.getAge());
    }
}
