package com.westar.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

@Document(indexName = "userindex",type = "user")
public class User {
    @org.springframework.data.annotation.Id
    private Long Id;
    private String first_name;
    private String last_name;
    private int age;
    private String about;
    private List<String> intrests;

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", about='" + about + '\'' +
                ", intrests=" + intrests +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<String> getIntrests() {
        return intrests;
    }

    public void setIntrests(List<String> intrests) {
        this.intrests = intrests;
    }
}
