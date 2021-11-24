package com.company;

public class Dancer extends Person{
    private String groupName;


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        System.out.println(getName()+" learns to dance with "+groupName);
    }

    @Override
    public void walk() {
        System.out.println(getName()+" goes to the dance");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" likes to drink water before breakfast");
    }
    public void dancing(){
        System.out.println(getName()+" dances well");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
