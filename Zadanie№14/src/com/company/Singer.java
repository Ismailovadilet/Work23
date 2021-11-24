package com.company;

public class Singer extends Person{
    private String bandName;


    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void learn() {
        System.out.println(getName()+" is good at dancing");
    }

    @Override
    public void walk() {
        System.out.println(getName()+" goes for his own purposes");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" likes to have breakfast");
    }

    public void singing(){
        System.out.println(getName()+" everything is fine with singing");
    }

    public void playGitar(){
        System.out.println(getName()+" plays the guitar very well");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
