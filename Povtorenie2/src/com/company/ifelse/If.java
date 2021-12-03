package com.company.ifelse;

public class If {
    public static void main(String[] args) {
        int age=20;
        int weight=80;
        if (age<=18){
            if (weight>50){
                System.out.println("Вы имеете право сдавать кровь");
            }else{
                System.out.println("Вы не имеете права сдавать кровь");
            }
        }else{
            System.out.println("Возраст должен быть больше 18");
        }
    }
}
