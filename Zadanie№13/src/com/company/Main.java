package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Dog dog=new Dog();
        System.out.println("Dog:");
        dog.setName("Alabai");
        dog.setAge(3);
        dog.setColour("black");
        System.out.println("Name: "+dog.getName()+", age: "+dog.getAge()+", colour: "+dog.getColour());
        dog.getEat();
        System.out.println();

        Cat cat=new Cat();
        System.out.println("Cat:");
        cat.setName("Tom");
        cat.setAge(2);
        cat.setColour("brown");
        System.out.println("Name: "+cat.getName()+", age: "+cat.getAge()+", colour: "+cat.getColour());
        cat.getEat();
        System.out.println();

        Fish fish=new Fish();
        System.out.println("Fish:");
        fish.setName("Farel");
        fish.setAge(5);
        fish.setColour("yellow");
        fish.setSpeed(100);
        System.out.println("Name: "+fish.getName()+", age: "+fish.getAge()+", colour: "+fish.getColour()+", speed "+fish.getSpeed()+"км/ч");
        fish.getEat();
        System.out.println();

        Parrot parrot=new Parrot();
        System.out.println("Popugay:");
        parrot.setName("Kakadu");
        parrot.setAge(7);
        parrot.setColour("green");
        parrot.setHeight(100);
        parrot.setSpeed(50);
        System.out.println("Name: "+parrot.getName()+", age: "+parrot.getAge()+", colour: "+parrot.getColour()+
                ", height: "+parrot.getHeight()+", speed: "+parrot.getSpeed());
        parrot.getEat();
    }
}
