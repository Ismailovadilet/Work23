package com.company;

public class Circle {
    private static final double PI = Math.PI;
    private static int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static void area() {

        System.out.println("Area: "+PI*(radius*radius));

    }
    public static void circumference(){
        System.out.println("Circumference: "+PI*2*radius);
    }
}