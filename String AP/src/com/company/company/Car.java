package com.company.company;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Car {
    private String name;
    private int power;

    public Car(String name, int power) {
        this.name = name;
        this.power = power;
    }
}
