package com.company.Methods;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.name="TOYOTA";
        car.model="Camry 45";
        car.colour="red";
        car.year=2020;
        car.cars();
        Car car1=new Car();


    }
}
class Car{
    String name;
    String model;
    String colour;
    int year;

    public void cars(){
        System.out.println(name+" "+model+", "+colour+" colour, year "+year);
    }
}
