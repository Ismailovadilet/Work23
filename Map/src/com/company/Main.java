package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Student> people= new HashMap<>();
        people.put(1,new Student("Adilet",21));
        people.put(2,new Student("Meder",21));
        people.put(3,new Student("Ermek",20));

        for (Student s:people.values()
             ) {
            System.out.println(s);
        }
        System.out.println();
        Map<Integer, Student> peopleOne= new TreeMap<>();
        peopleOne.put(2,new Student("Adilet",21));
        peopleOne.put(1,new Student("Meder",21));
        peopleOne.put(3,new Student("Ermek",20));

        for (Student s:peopleOne.values()
        ) {
            System.out.println(s);

        }
    }
}
