package com.springboot.mydemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "mydemouser")
public class User {

    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    Integer id;
    @Column
    Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
