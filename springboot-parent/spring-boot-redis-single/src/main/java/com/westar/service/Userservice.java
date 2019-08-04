package com.westar.service;

import com.westar.dao.UserDao;
import com.westar.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

@Service
public class Userservice {
    @Autowired
    private UserDao userDao;


    @Autowired
    private JedisCluster jedisCluster;

    @Cacheable(value = "myname")
    public User findUserByName(String name){
        System.out.println("从数据库查询");
        return null;
    }

    public void addUser(User user){
        userDao.addUser(user);
    }

    public String findRedis(){
        jedisCluster.set("haha","kele");
        return jedisCluster.get("haha");
    }
}
