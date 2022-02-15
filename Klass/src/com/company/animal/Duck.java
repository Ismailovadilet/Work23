package com.company.animal;

public class Duck implements SwimAble {
    private String name;
    private int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void Swim() {
        System.out.println(name+" Float above the water");
    }
    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
