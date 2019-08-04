package com.westar.pojo;

import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.id.InternalIdStrategy;

@NodeEntity(label = "User")
public class UserNode {

//    @GraphId
    @Id
    @GeneratedValue(strategy = InternalIdStrategy.class)
    private Long nodeId;

    @Property
    private String userId;
    @Property
    private String name;
    @Property
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
