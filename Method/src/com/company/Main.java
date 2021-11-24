package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getSum(10,55));
        getSam(10,55);
        int a=getSum(10,55);
        int summa=a+getSum(5,10);
        System.out.println(summa);

    }public static int getSum (int number,int numberOne){
        int sum=number+numberOne;
        return sum;
    }
    public static void getSam (int number,int numberOne){
        int sam=number+numberOne;
        System.out.println(number+"+"+numberOne+"="+sam);
    }
}
