package com.company;

import java.util.Scanner;

public class zadanie {

    public static void main(String[] args) {
	// write your code here
        //Zadanie№5,1
        Scanner scanner=new Scanner(System.in);
        System.out.println("Eki san jaz: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("joop:");

        while (a<b){
            a++;
            if (a%2==1){
                System.out.print("");
                System.out.print(a+" ");

            }
        }


    }

   }



