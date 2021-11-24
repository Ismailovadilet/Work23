package com.company.methods2;

public class Main {

    public static void main(String[] args) {
        Person person1=new Person();
        person1.getMeaning();
        person1.name="Nurbek";
        person1.age=15;
        person1.num();
        person1.sum();
        System.out.println();
        Person person2=new Person();
        person2.getMeaning();
        person2.name="Aibek";
        person2.age=17;
        person2.num();
        person2.sum();
        System.out.println();
        Person person3=new Person();
        person3.getMeaning();
        person3.name="Adilet";
        person3.age=21;
        person3.num();
        person3.sum();
    }
}
class Person {
    String name;
    int age;

    public void getMeaning(){
        System.out.println("Как вас зовут, и сколько вам лет?");
    }

    void num(){
        System.out.println("Меня зовут "+name+", мне "+age+" лет!");
    }

    public void sum(){
        if (age<21 || 21<age){
            System.out.println("вы не можете работать.");
        }else {
            System.out.println("вы можете работать.");
        }
    }
}