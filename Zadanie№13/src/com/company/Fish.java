package com.company;

public class Fish extends Cat{
    private int speed;

    public Fish() {
        super();
    }

    public Fish(String name, int age, String colour, int speed) {
        super(name, age, colour);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void getEat() {
        System.out.println(getName()+" floating in the water");
    }
}
