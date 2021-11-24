package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int razmer=scanner.nextInt();
        Random random=new Random();
        int [] massiv=new int[razmer];
        int a=0;
        while (a<massiv.length){
            massiv[a]=random.nextInt(100);
            a++;
            System.out.println(a);


        }
    }
}


