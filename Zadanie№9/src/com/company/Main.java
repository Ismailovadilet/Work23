package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 100;
        num(number);
    }

    public static void num(int number) {
        int sum=0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 || i % 4 == 0 || i % 5 == 0) {
                sum+=i;
                if(i==number){
                    System.out.print(i+"="+sum);
                }else{
                    System.out.print(i+"+");
                }
            }
        }
    }
}