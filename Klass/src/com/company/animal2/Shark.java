package com.company.animal2;

public class Shark implements SwimAble{
    private String name;
    private int age;

    public Shark() {
    }

    public Shark(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void attack(){
        System.out.println("Очень опасен");
    }
    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
