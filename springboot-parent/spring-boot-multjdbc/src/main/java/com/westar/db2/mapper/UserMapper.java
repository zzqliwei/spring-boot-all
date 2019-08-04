package com.westar.db2.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Date;

@Qualifier("db2sqlSessionFactory")
public interface UserMapper {
    @Insert("insert into users(name,age)values(#{name},#{birthDay})")
    public void addUser(@Param("name")String name,@Param("birthDay") Date birthDay);
}
