package com.company.exception;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        double number2 = Math.sqrt(number1);

        try {


            if ((number2 * number2) == number1) {
                System.out.println(Math.round(number1) + "it's true");
            } else {
                System.out.println(Math.round(number1) + " it's false");
            }


        } catch (Exception e) {
            e.getMessage();
        }

    }
}