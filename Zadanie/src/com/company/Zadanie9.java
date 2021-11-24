package com.company;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
//        Задание девятое
        Scanner sc=new Scanner(System.in);
        System.out.println("Сколько дней проживания");
        int days= sc.nextInt();
        int year=365;
        int month=30;
        int age= (days/year);
        int age2= days-(age*year);
        int age3= age2/month;
        System.out.println();
        System.out.print(age+ " год, ");
        System.out.println(age3+ " месяц");

    }
}
