package com.learn.mybatis.pojo;

import javax.persistence.Table;
import java.util.Date;

/**
 * @program: mybatis
 * @description
 * @author: Mr.Yang
 * @create: 2021-07-16 11:45
 **/
@Table(name = "user")
public class User {
    private Integer id;

    private String name;

    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
