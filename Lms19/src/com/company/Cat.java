package com.company;

public class Cat extends Animal{
    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    void eat() {
        System.out.println(getName()+" сут ичет");
    }
    public void play(){
        System.out.println(getName()+" жип ойнойт");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +'\''+
                "}";
    }
}
