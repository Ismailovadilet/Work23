package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=5;
        int summa=1;
        int i=1;
        System.out.println("joop: ");
        while (i<=n){
            summa*=i;
            if (i==n){
                System.out.print(i+"="+summa);
            }else {
                System.out.print(i+ "*" );
            }
            i++;
        }

    }
}
