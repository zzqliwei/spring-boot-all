package com.westar.dao;

import com.westar.pojo.UserNode;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository extends Neo4jRepository<UserNode,Long> {

    @Query("MATCH (n:User) return n")
    List<UserNode> getUserNodeList();

    @Query("INSERT (n:User{age:{age},name:{name} RETURN n}")
    List<UserNode> addUserNodeList(@Param("name")String name,@Param("age")int age);
}
