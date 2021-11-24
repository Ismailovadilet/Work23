package com.company.Cars;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Mercedes Benz", "E-klass-211", 2000, 1500, "White", 4);
        System.out.println(car.name+" "+car.model+" "+car.weight+"kg "+car.power+"moshnosti, svet "+car.colour+" "+car.doors+" doors");

        Toyota toyota=new Toyota("Camry", "45", 2500, 2000, "black", 4);
        System.out.println(toyota.name+" "+toyota.model+" "+toyota.weight+"kg "+toyota.power+"moshnost, svet "
                +toyota.colour+" "+toyota.doors+" doors");


    }
}
