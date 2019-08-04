package com.westar.pojo;

import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.id.InternalIdStrategy;

@RelationshipEntity(type = "UserRelation")
public class UserRelation {
//    @GraphId
    @Id
    @GeneratedValue(strategy = InternalIdStrategy.class)
    private Long id;
    @StartNode
    private UserNode startNode;
    @EndNode
    private UserNode endNode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserNode getStartNode() {
        return startNode;
    }

    public void setStartNode(UserNode startNode) {
        this.startNode = startNode;
    }

    public UserNode getEndNode() {
        return endNode;
    }

    public void setEndNode(UserNode endNode) {
        this.endNode = endNode;
    }
}
