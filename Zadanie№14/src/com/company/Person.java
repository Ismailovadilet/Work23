package com.company;

public class Person {
    private String name;
    private String designation;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void learn(){
        System.out.println(name+" learn in peaksoft");
    }
    public void walk(){
        System.out.println(name+" goes to peaksoft");
    }
    public void eat(){
        System.out.println(name+" eats a sandwich");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}