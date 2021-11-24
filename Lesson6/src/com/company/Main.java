package com.company;

public class Main {

    public static void main(String[] args) {
        Apple apple=new Apple ("apport","kizil",0.3,true,true,"kizil alma", 50);
        apple.getImport();
        apple.getPrice();
        apple.check(apple.isEdible());
    }

}
