package com.company;

import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {
	// write your code here
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Минута");
        int time1 = sc1.nextInt();
        int time2 = 60;
        int time3 = time1 % 5;

        if (time3 == 0 || time3 == 4){
            System.out.println("Красный");
        }else {
            System.out.println("Зеленный");
        }

    }
}
