package com.company.level1;

import java.util.Random;

public class Dragon {
    private String name; //аты
    private int healthPoints; // Жизненная энергия
    private int defence; // Защита
    private int strength; // Сила
    private int weapon; // Оружие
    boolean die = false;

    public Dragon(String name, int healthPoints, int defence, int strength, int weapon) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
    }

    public void died() {
        if (healthPoints > 1) {
            die = false;
        } else {
            die = true;
        }
    }

    public void getUron(int lostUron) {
        if (lostUron > 0) {
            healthPoints = (healthPoints + defence) - lostUron;
        }
    }

    public void printLive() {
        System.out.println("|====Жизненная энергия: " + name + ": " + healthPoints + "====| \n ");
        System.out.println("|=======Защита Героя " + name + ": " + healthPoints + "=======| \n ");
    }

    Random random=new Random();

    public int hit(){
        int attack=random.nextInt(3)+1;
        if (attack<3){
            int lost=strength+weapon;
            System.out.println("|======== "+name+" атакует ! ========|");
            System.out.println("|======= Атака прошла успешно! =======|\n");
            System.out.println("|===Нанесенный урон от "+name+": "+lost+"===|");
            return lost;
        }else {
            int lost=0;
            System.out.println("|====== "+name+" Промахнулся! ======|");
            System.out.println("|=== В следущий раз точно попадет! ===|");
            return lost;
        }
    }
}
