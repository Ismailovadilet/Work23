package com.company;

import javax.crypto.AEADBadTagException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Random rnd = new Random();
//        int[] massive = new int[10];
//        for (int i = 0; i < massive.length; i++) {
//            int num = rnd.nextInt(100);
//            massive[i] = num;
//            if (massive[i] % 5 == 0) {
//                System.out.println(massive[i]);
//
//            }
//
//        }
//
//        //-128-127
//        //-32,768-32,767
//        // -2,147,483,648-2,147,483,647
//        //-9,223,372,036,854,775,808-9,223,372,036,854,775,807
//
//       float numberFive=3143243.4f;
//        byte numberOne= 101;
//        short numberTwo=1178;
//        int numberThree=28475;
//        long numberFour=432774;
//
//         double numberSix=2353.54;
//
//        boolean numberSeven=true || false;
//        char numberEight='5';
//
//        String surName = "Ismailov";
//        String name = "Adilet";
//        String middleNames = "Baktybeekovich";
//        String placeOfBirth = "Batken";
//        System.out.println("Men "+surName+" "+name+" "+middleNames+"! "+placeOfBirth+" jergesinen keldim!");

//        Scanner scanner=new Scanner(System.in);
//        int a=scanner.nextInt();
//        Random random=new Random();
//        int [] massiv=new int[a];
//        for (int i=0; i<massiv.length; i++){
//            massiv[i] = random.nextInt(100);
//            if (massiv[i]%2==0) {
//                System.out.print(massiv[i] + " ");
//            }else {
//                System.out.print(massiv[i] + " ");
//            }
//        }

        //i++; - i = i + 1; -Инкримент

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Введите число");
//        int number=scanner.nextInt();
//        System.out.println("Вы ввели: "+number);

//        Scanner scanner=new Scanner(System.in);
//        int value;
//        do {
//            System.out.println("Vvedi 5:");
//            value=scanner.nextInt();
//        }while (value!=5);
//        System.out.println("Vy Vveli 5;");

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Vvedi 5:");
//        int number=sc.nextInt();
//        while (number!=5){
//            System.out.println("Vvedi 5:");
//            number=sc.nextInt();
//        }
//        System.out.println("Vy Vveli 5:");

//
//        int [] num1={1,2,3,4,5};
//        int [] num2={1,2,3,5,4};
//        System.out.println(Arrays.equals(num1,num2));
//        Arrays.sort(num2);
//        System.out.println(Arrays.equals(num1,num2));

//        System.out.println("Naiti min ili max element!");
//        System.out.println("Naprimer:");
//        int [] massiv= {1,8,3,3,4,4,9,12};
//        for (int i=0; i<massiv.length; i++){
//            System.out.print(massiv[i]+" ");
//        }
//        System.out.println("\n"+"Otvet:");
//        Arrays.sort(massiv);
//        a(massiv);
//        b(massiv);
//    }
//    public static void a (int []arrays){
//        System.out.println("Minimalnyi element: "+arrays[0]);
//    }
//    public static void b (int []arrays){
//        System.out.println("Maksimalnyi element: "+arrays[arrays.length-1]);

//        Scanner scanner=new Scanner(System.in);
//        int num=scanner.nextInt();
//
//        for (int i=0; i<=10; i++){
//            int a=num*i;
//            System.out.println(num+ "*"+i+"="+a);
//        }

//        Scanner scanner=new Scanner (System.in);
//        System.out.println("Введите должности сотридников МЧС");
//        String post=scanner.nextLine();
//        work(post);
//
//    }
//    public static void work (String post){
//        switch (post){
//            case "Начальник":
//                System.out.println("Оклад: 11450");
//                break;
//            case "Зам.начальник":
//                System.out.println("Оклад: 10450");
//                break;
//            case "Главный Бух":
//                System.out.println("Оклад: 8990");
//                break;
//            case "Глав.спец":
//                System.out.println("Оклад: 7990");
//                break;
//            case "Ст.офицер":
//                System.out.println("Оклад: 7450");
//                break;
//            default:
//                System.out.println("Нету такого долж");
//       }
//
//        int[] nums = {1, 4, 6, 3, 8, 9};
//        getAverage(nums);
//    }
//    public static void getAverage(int[] massive) {
//        int b = 0;
//        for (int i = 0; i < massive.length; i++) {
//            b = b + massive[i];
//        }
//        System.out.println("Среднее арифметическое число: " + b / (massive.length));
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("write radius");
//        calculateRadius(scanner.nextInt());
//    }
//    public static void calculateRadius(int radius) {
//        System.out.println("Area of circle  "+Math.round (Math.PI * (Math.pow(radius, 2))));


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Write number:");
//        int num = sc.nextInt();
//        getNum(num);
//    }
//
//    public static void getNum(int num) {
//        for (int i = 0; i < num; i++) {
//            System.out.print("*");
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите возраст первого студента");
//        int first = scanner.nextInt();
//        System.out.println("Введите возраст второго студента");
//        int second = scanner.nextInt();
//
//        String nameOne="Nurbek";
//        String nameTwo="Sherik";
//
//        if (first > second){
//            System.out.println(nameOne+" "+first);
//        }else {
//            System.out.println(nameTwo+" "+second);
//        }

//
//        Scanner scanner=new Scanner(System.in);
//        int number=scanner.nextInt();
//
//        int a=number/10;
//        int b=number-(a*10);
//
//        if (number%a==0 && number%b==0){
//            System.out.println("Болунот");
//        }else
//            System.out.println("Болунбойт");



//        Scanner scanner=new Scanner(System.in);
//        int number=scanner.nextInt();
//        int num=0;
//
//        while (num<=number){
//            System.out.println(num);
//            num++;


//        Scanner scanner=new Scanner(System.in);
//        int number=scanner.nextInt();
//        int num=0;
//
//        while (number>=num) {
//            System.out.println(number);
//            number--;


//        Scanner scanner=new Scanner(System.in);
//        int number=scanner.nextInt();
//
//        for (int i=0; i<=number; i++){
//            if (i % 5 > 0 && i % 4  0){
//                System.out.println(i);
//            }


//        Scanner scanner=new Scanner(System.in);
//        String text=scanner.nextLine();
//
//        for (int i = 0; i < text.length(); i++) {
//            System.out.println(text.charAt(i));
//        }

//палиндром
//        Scanner scanner=new Scanner(System.in);
//        String name=scanner.nextLine();
//        StringBuffer name1=new StringBuffer(name).reverse();
//
//        for (int i = 0; i < name.length(); i++) {
//            if (name.charAt(i) == name1.charAt(i)){
//                System.out.println(name.charAt(i));
//            }else {
//                System.out.println("Ошибка");
//            }
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        String text = scanner.nextLine().toLowerCase(Locale.ROOT);
//        String text2 = "";
//
//        for (int i = text.length()-1; i >= 0 ; i--) {
//            text2 += text.charAt(i);
//        }
//        if (text.equals(text2)){
//            System.out.println("Polindrom");
//        }else {
//            System.out.println("Polindrom emes");
//        }
//        Scanner sc = new Scanner(System.in);
//
//        String text1 = sc.nextLine().toLowerCase(Locale.ROOT);
//        String text3 = "";
//
//        for (int i = 1; i<text1.length()-1; i++) {
//            text3 += text1.charAt(i);
//        }
//        System.out.println(text3);

//        int[] array = {10,20,9,40,70,80};
//        int numberMax = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (numberMax<array[i]){
//                numberMax = array[i];
//            }
//        System.out.println(numberMax);

//
//        int[] array = {10,20,9,40,70,80};
//        int numberMax = array[0];
//        int indexOfMax=0;
//
//        for (int i = 1; i < array.length; i++) {
//            if (numberMax < array[i]){
//                numberMax = array[i];
//                indexOfMax = i;
//            }
//        }
//        System.out.println(numberMax);
//        System.out.println(indexOfMax);

//        int[] array = {10,20,9,40,70,80};
//        for (int i:array) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        for (int i = 1; i < array.length; i++) {
//            if (array[i]>array[0]){
//                array[0] = array[0] + array[i];
//                array[i] = array[0] - array[i];
//                array[0] = array[0] - array[i];
//
//            }
//        }
//        for (int i: array){
//            System.out.print(i+" ");
//        }

        int num1, num2, сумма;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Введите первое число: ");num1 = sc.nextInt();

        System.out.println("Введите второе число: ");num2 = sc.nextInt();sc.close();сумма = num1 + num2;
        System.out.println("Сумма этих чисел: "+сумма);
    }
}




















