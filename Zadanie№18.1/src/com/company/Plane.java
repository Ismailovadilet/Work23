package com.company;

public class Plane implements Flyable{
    private String name;
    private int speed;

    public Plane(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void fly() {
        System.out.println(name+" может лететь со скоростью "+speed+" км/ч");
    }
}
