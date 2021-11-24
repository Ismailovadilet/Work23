package com.company;

public class Main {

    public static void main(String[] args) {

        Person person=new Person();
        person.setName("Albert");
        person.setDesignation("Frontend");
        System.out.println(person);
        person.learn();
        person.walk();
        person.eat();
        System.out.println();

        Programmer programmer=new Programmer();
        programmer.setName("Meder");
        programmer.setDesignation("Backend");
        programmer.setCompanyName("Purpose");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println();

        Dancer dancer=new Dancer();
        dancer.setName("Nurisa");
        dancer.setDesignation("dance");
        dancer.setGroupName("Java");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println();

        Singer singer=new Singer();
        singer.setName("Aisuluu");
        singer.setDesignation("Singer");
        singer.setBandName("Java");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
    }
}
