package com.company;

public class Dog extends Animal {

    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    void eat() {
        System.out.println(getName()+" эт жейт");
    }
    public void run(){
        System.out.println(getName()+" чуркаганды жакшы корот");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +'\''+
                "}";
    }
}
