package com.company;

public class Main {

    public static void main(String[] args) {
        Bird bird=new Bird("Воробей",70);
        bird.fly();
        Parrot parrot=new Parrot("Попугай",50);
        parrot.fly();
        Plane plane=new Plane("Самалет",120);
        plane.fly();
    }
}
