package com.nicky.spring.extend.customtag;

import java.io.Serializable;

/**
 * StudentBean
 *
 * @author gaoxi
 * @Time 2017/11/24
 */
public class StudentBean implements Serializable {

    private static final long serialVersionUID = 1460662458112615915L;

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
