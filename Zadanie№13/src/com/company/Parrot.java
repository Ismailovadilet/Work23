package com.company;

public class Parrot extends Fish {
    private int height;

    public Parrot() {
        super();
    }

    public Parrot(String name, int age, String colour, int speed, int height) {
        super(name, age, colour, speed);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void getEat() {
        System.out.println(getName()+" flying, height "+getHeight()+"m ");
    }
}
