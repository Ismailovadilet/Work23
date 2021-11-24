package com.company.Fishes;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Carp carp=new Carp("Карп", "серебристый", 2, 30);
        System.out.println(carp.name+" цвет "+carp.colour+" "+carp.weight+"кг "+carp.length+"см");
    }
}
