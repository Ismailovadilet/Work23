package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        int [] massive = {1,2,3,4,5,6,7};

        Class klass=new Class(4,"Java-4",massive);
        System.out.println(klass.number+"\n"+klass.word);
        for (int a : massive) {
            System.out.print(a+" ");
        }
    }
}
