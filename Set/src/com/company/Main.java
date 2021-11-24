package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Set <Integer> numbers=new HashSet<>();
//        Random random=new Random();
//        int sum=0;
//        for (int i = 0; i < 100; i++) {
//            int number=random.nextInt(400);
//            numbers.add(number);
//            sum=sum+number;
//        }
//        System.out.println(numbers);
//        System.out.println("Сумма всех чисел: "+sum);

//        String nameOne="Daisy";
//        String nameTwo="Daisy";
//        System.out.println(nameOne);


        List<String> list= new ArrayList<>();
        list.add("String");   
//        list.get(0);
//        list.remove(0);
//        for (String team: list) {
//            System.out.println(team);
//        }
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Set<String> set=new HashSet<String>();
        set.add("String");
        set.add("String");
        set.add("String");

        
    }
}
