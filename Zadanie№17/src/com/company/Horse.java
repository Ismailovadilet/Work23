package com.company;

public class Horse extends Sheep{
    private String colour;

    public Horse(int weight, int age, String  gender, String nickName, String colour) {
        super(weight, age, gender, nickName);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + getWeight() +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                '}';
    }
}


