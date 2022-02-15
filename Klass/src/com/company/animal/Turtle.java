package com.company.animal;

import com.company.animal.SwimAble;

public class Turtle implements SwimAble {
    private String name;
    private int age;

    public Turtle(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void Swim() {
        System.out.println(name+" Slowly floating above the water");
    }
    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

