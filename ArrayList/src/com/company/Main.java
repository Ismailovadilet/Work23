package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Random random=new Random();
        int number=random.nextInt(10);
        list.add(number);
        list.add(number);
        list.add(number);
        list.add(number);
        list.add(number);



        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
