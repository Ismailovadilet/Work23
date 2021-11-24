package com.company.level1;

import java.util.Random;

public class Hero  {
    private String name; //аты
    private int healthPoints; // Жизненная энергия
    private int defence; // Защита
    private int strength; // Сила
    private int weapon; // Оружие
    private int shield; // Щит
    boolean did=false;


    public Hero(String name, int healthPoints, int defence, int strength, int weapon, int shield) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
        this.shield = shield;
    }

    Random random=new Random();

    public int fight(){
        int attack=random.nextInt(3)+1;
        if (attack<3){
            int loss=strength+weapon;
            System.out.println("|======== "+name+" атакует ! ========|");
            System.out.println("|======= Атака прошла успешно! =======|\n");
            System.out.println("|===Нанесенный урон от "+name+": "+loss+"===|");
            return loss;
        }else {
            int loss=0;
            System.out.println("|====== "+name+" Промахнулся! ======|");
            System.out.println("|=== В следущий раз точно попадет! ===|");
            return loss;
        }
    }
    public void printLive(){
        System.out.println("|====Жизненная энергия: "+name+": "+healthPoints+"====| \n");
        System.out.println("|=======Защита Героя "+name+": "+healthPoints+ "=======| \n");
    }

    public void bag (){
        if (healthPoints>1){
            did=false;
        }else {
            did=true;
        }
    }
    public void hit (int hits){
        if (hits>0){
        healthPoints=(healthPoints+defence)-hits;
    }
    }
}


