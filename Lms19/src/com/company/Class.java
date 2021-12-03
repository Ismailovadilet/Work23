package com.company;

import java.util.Arrays;

public class Class {
    private Dog[] dogs;
    private Sheep[] sheep;
    private Cat[] cats;

    public Class(Dog[] dogs, Sheep[] sheep, Cat[] cats) {
        this.dogs = dogs;
        this.sheep = sheep;
        this.cats = cats;
    }

    @Override
    public String toString() {
        return
                "\ndogs=" + Arrays.toString(dogs) +
                        "\nsheep=" + Arrays.toString(sheep) +
                        "\ncats=" + Arrays.toString(cats) ;

    }
}
