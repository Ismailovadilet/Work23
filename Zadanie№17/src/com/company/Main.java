package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Farm1 farm1 = new Farm1("Алай", 5, 2, 3, "Alai Farm");
        Cow cows1=new Cow(68,3,"male","Brangus");
        Cow cows2=new Cow(45,2,"male","Obrak");
        Cow cows3=new Cow(30,1,"female","Barzona");
        Cow cows4=new Cow(75,4,"female","Braford");
        Cow cows5=new Cow(47,2,"male","Loulain");
        System.out.println(farm1);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("---1--- "+cows1+"\n"+"---2--- "+cows2+"\n"+"---3--- "+cows3+"\n"+"---4--- "
                +cows4+"\n"+"---5--- "+cows5);
        System.out.println("|=================================================================|");
        Sheep sheep1=new Sheep(25,3,"female","Dorper");
        Sheep sheep2=new Sheep(40,4,"male","Avassi");
        Sheep sheep3=new Sheep(36,5,"male","Katadin");
        System.out.println("---1--- "+sheep1+"\n"+"---2--- "+sheep2+"\n"+"---3--- "+sheep3);
        System.out.println("|=================================================================|");
        Horse horse1=new Horse(130,5,"female","Mustang","white");
        horse1.getColour();
        Horse horse2=new Horse(120,4,"male","Shair","black");
        horse2.getColour();
        System.out.println("---1--- "+horse1+" "+horse1.getColour()+"\n"+"---2--- "+horse2+" "+horse2.getColour());
        System.out.println("|=================================================================|");

        System.out.println();
        Farm2 farm2=new Farm2("Batken",1,1,1,"Charba Farm");
        System.out.println(farm2);
        System.out.println("---------------------------------------------------------------------");
        Cow cow =new Cow(78,4,"female","aaa");
        System.out.println("---1---"+cow);
        System.out.println("|=================================================================|");
        Sheep sheep=new Sheep(34,3,"male","aaaa");
        System.out.println("---2---"+sheep);
        System.out.println("|=================================================================|");
        Horse horse=new Horse(114,3,"male","aaaaa","red");
        System.out.println("---3---"+horse);
        System.out.println("|=================================================================|");

    }
}