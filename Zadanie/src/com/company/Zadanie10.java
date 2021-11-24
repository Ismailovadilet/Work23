package com.company;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {

    //        Задание десятое
        Scanner sc=new Scanner(System.in);
        System.out.print("Your name:");
        String name1=sc.nextLine();
        System.out.print("Your age:");
        String name2=sc.nextLine();
        System.out.print("Your country:");
        String name3=sc.nextLine();
        System.out.print("Year of birth:");
        int name4=sc.nextInt();
        int name5=2019-name4;
        System.out.println();
        System.out.println("Your name is " +name1.toUpperCase()+ " " +name2.toUpperCase()+
                ". And you " +name5+ " years old, and you are from " +name3);

}
}
