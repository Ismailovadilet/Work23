package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Найти мин и макс элемент!");
        System.out.print("Например:");
        int [] massiv= {1,8,3,3,4,4,9,12};
        for(int i=0;i< massiv.length;i++){
            System.out.print(massiv[i]+" ");
        }
        Arrays.sort(massiv);
        System.out.println("\nОтвет:");
        getMin(massiv);
        getMax(massiv);
    }
    public static void getMin (int []arrays){
        System.out.println("Минимальный элемент: "+arrays[0]);
    }
    public static void getMax (int []arrays){
        System.out.println("Максимальный  элемент: "+arrays[arrays.length-1]);
    }
}
