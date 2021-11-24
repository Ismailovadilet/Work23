package com.company;

public class Bird implements Flyable{
    private String name;
    private int speed;


    public Bird(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void fly() {
        System.out.println(name+" может лететь со скоростью "+speed+" км/ч");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
