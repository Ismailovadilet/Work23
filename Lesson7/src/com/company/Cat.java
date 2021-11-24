package com.company;

public class Cat extends Dog{

    public Cat(String name, int age, String colour) {
        super(name, age, colour);
    }

    @Override
    public void getEat() {
        System.out.println("любимое блюда мясо");
    }
}
