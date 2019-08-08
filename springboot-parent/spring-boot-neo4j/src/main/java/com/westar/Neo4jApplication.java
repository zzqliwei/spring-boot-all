package com.westar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories(basePackages = "com.westar.dao")
@EntityScan(basePackages = "com.westar.pojo")
public class Neo4jApplication {
    public static void main(String[] args) {
        SpringApplication.run(Neo4jApplication.class,args);
    }
}
