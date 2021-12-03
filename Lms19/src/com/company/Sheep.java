package com.company;

public class Sheep extends Animal{
    public Sheep(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    void eat() {
        System.out.println(getName()+" чоп жейт");
    }
    public void give(){
        System.out.println(getName()+" жун берет");
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +'\''+
                "}";
    }
}
