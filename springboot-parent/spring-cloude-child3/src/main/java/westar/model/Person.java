package westar.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Person {
    private String name;
    private int id;
    @JSONField(format = "yyyy-mm-dd")
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
