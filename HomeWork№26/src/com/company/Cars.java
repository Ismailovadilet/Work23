package com.company;

public class Cars {
    private int yearOfRelease;
    private String model;
    private int price;
    private String colour;

    public Cars(int yearOfRelease, String model, int price, String colour) {
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "yearOfRelease=" + yearOfRelease +
                ", model=" + model +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
