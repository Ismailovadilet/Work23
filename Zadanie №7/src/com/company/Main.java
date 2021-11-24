package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Joop:");
        int[] massive = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        for (int i = 1; i < massive.length; i++) {
            massive[i] = i;
            if (massive[i] % 2 == 0) {
                System.out.print(massive[i] + " ");
            }
        }
    }
}
