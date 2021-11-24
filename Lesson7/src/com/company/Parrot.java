package com.company;

public class Parrot extends Cat{

    public Parrot(String name, int age, String colour) {
        super(name, age, colour);
    }

    @Override
    public void getEat() {
        System.out.println();
    }
}
