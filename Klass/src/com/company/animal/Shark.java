package com.company.animal;

public class Shark implements SwimAble {
    private String name;
    private int age;
    public Shark(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public void Swim() {
        System.out.println(name+" Predator");
    }
}
