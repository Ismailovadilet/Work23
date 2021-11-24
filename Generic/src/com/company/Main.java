package com.company;

public class Main {

    public static void main(String[] args) {

        OldGenerics oldGenerics=new OldGenerics("Старый дженерикс");
        OldGenerics oldGenerics1=new OldGenerics(10);
        System.out.println(oldGenerics.getValue());
        System.out.println(oldGenerics1.getValue());

        NewGenerics<String>newGenerics=new NewGenerics<>("Новый дженерикс");
        NewGenerics<Integer>newGenerics1=new NewGenerics<>(1);
        System.out.println(newGenerics.getValue());
        System.out.println(newGenerics1.getValue());

    }
}
