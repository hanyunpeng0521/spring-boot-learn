package com.hyp.learn.r.model;

import java.io.Serializable;

/**
 * @author hyp
 * Project name is spring-boot-learn
 * Include in com.hyp.learn.w.model
 * hyp create at 19-12-21
 **/
public class User implements Serializable {
    /**
     * 编号
     */
    private Integer id;
    private String name;
    private int age;
    private String pass;
    //setter、getter省略

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }


}
