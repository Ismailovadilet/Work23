package com.company.level1;

import com.company.level1.Dragon;
import com.company.level1.Hero;

public class Main {
    public static void main(String[] args) {

        Dragon dragon=new Dragon("Дракон",2000, 120,150,0);
        Hero hero=new Hero("Эр-Тоштук",1000,100,120,250,150);

        while (dragon.die) {
            dragon.died();
            dragon.printLive();
            hero.printLive();
            if (dragon.die == false) {
                System.out.println("|========== Игра началась! ==========|");
                int uron = hero.fight();
                dragon.getUron(uron);
            }

            while (hero.did)
            hero.bag();
            hero.printLive();
            dragon.printLive();
            if (hero.did == false) {
                System.out.println("|========== Игра началась! ==========|");
                int uron = dragon.hit();
                hero.hit(uron);
            }
        }
    }
}

