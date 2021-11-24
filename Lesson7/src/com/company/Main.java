package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog=new Dog("Volt",3,"black");
        System.out.println("Name: "+dog.getName()+", age: "+dog.getAge()+", colour: "+dog.getColour());
        dog.getEat();

        Cat cat=new Cat("Cat",2,"brown");
        System.out.println("Name: "+cat.getName()+", age: "+cat.getAge()+", colour: "+cat.getColour());
        cat.getEat();

        Parrot parrot=new Parrot("Aleks",5,"green");
        System.out.println("Name: "+parrot.getName()+", age: "+parrot.getAge()+", colour: "+parrot.getColour());
        parrot.getEat();
    }
}
