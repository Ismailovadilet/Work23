package com.company.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String name;
    private int age;
    private String gender;

    public User(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "id: " + id +"';"+
                " name: " + name + '\''+";" +
                " age: " + age + "';" +
                " gender: " + gender + '\'';
    }
}
