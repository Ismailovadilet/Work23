package com.company.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>(
                Arrays.asList(new Car("Honda",250),
                              new Car("Lexus",230)));

        List<String>carList1=carList.stream().map(x->x.getName()).collect(Collectors.toList());
        System.out.println(carList1);

        List<Integer>carList2=carList.stream().map(x->x.getPower()).collect(Collectors.toList());
        System.out.println(carList2);
    }
}
