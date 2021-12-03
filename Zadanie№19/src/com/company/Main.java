package com.company;

public class Main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[3];
        animal[0] = new Sheep("Меринос", 3, 54);
        System.out.println(animal[0].getClass());
        Sheep sheep = (Sheep) animal[0];
        boolean ss = animal[0] instanceof Animal;
        System.out.println(ss);
        sheep.eat();
        sheep.give();
        System.out.println();

        animal[1] = new Dog("Хатико", 4, 65);
        System.out.println(animal[1].getClass());
        Dog dog = (Dog) animal[1];
        boolean f = animal[1] instanceof Animal;
        System.out.println(f);
        dog.eat();
        dog.ran();
        System.out.println();

        animal[2]=new Cat("Рэгдолл",3,5);
        System.out.println(animal[2].getClass());
        Cat cat= (Cat) animal[2];
        boolean d=animal[2] instanceof Animal;
        System.out.println(d);
        cat.eat();
        cat.play();


        Sheep[] sheep1 = {sheep};
        Dog[] dogs = {dog};
        Cat[] cats={cat};
        Class clas = new Class(dogs, sheep1,cats);
        System.out.println(clas);
    }
}

