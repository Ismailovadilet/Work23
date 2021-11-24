package com.company.Четные;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        Random random=new Random(number);

        for (int i=0; i<number; i++){

            System.out.println(number);

        }
    }
}
