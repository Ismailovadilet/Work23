package com.company;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        //Zadanie№5,2
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите значение: ");
        int c=sc.nextInt();
        int summa=0;
        int i=1;
        System.out.println("joop:");
        while (i<=c){
            summa+=i;
            if (i==c){
                System.out.print(i+"="+summa);
            }else {
                System.out.print(i+ "+" );
            }
            i++;
        }

    }
}
