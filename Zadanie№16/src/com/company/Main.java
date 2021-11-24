package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write the number: ");
        Circle circle=new Circle(scanner.nextInt());
        circle.area();
        circle.circumference();
    }
}


