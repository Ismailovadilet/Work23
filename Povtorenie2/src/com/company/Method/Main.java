package com.company.Method;

public class Main {
    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.name="Cow";
        animal1.age=4;
        animal1.colour="black";
        animal1.speak();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Animal animal2=new Animal();
        animal2.name="Sheep";
        animal2.age=3;
        animal2.colour="white";
        animal2.speak();

    }
}
class Animal{
    String name;
    int age;
    String colour;
    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println(name+" "+age+" jashta, tusu "+colour);
        }
    }
}
