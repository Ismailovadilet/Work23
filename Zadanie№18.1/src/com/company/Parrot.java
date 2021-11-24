package com.company;

public class Parrot implements Flyable{
    private String name;
    private int speed;

    public Parrot(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void fly() {
        System.out.println(name+" может лететь со скоростью "+speed+" км/ч");
    }
}
