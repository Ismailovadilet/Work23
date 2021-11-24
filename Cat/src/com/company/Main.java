package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat cat=new Cat();
        cat.name="Garfild";
        cat.age=2;
        cat.weight=8;
        cat.bread="swinks";

        Cat catOne=new Cat();
        catOne.name="Daisy";
        catOne.age=3;
        catOne.weight=5;
        catOne.bread="Mein Mun";

        Cow buka=new Cow();
        buka.name="Bobosya";
        buka.age=3;
        buka.color="brown";
        buka.weight=260;
        buka.bread="Brangus";

        Darak tal=new Darak();
        tal.species="Kut";
        tal.age=7;
        tal.place="Batken";
        tal.high=11;

        Smartphone telephone=new Smartphone();
        telephone.name="Iphone";
        telephone.model="Xs";
        telephone.year=2017;
        telephone.charger=98;

        System.out.println(cat.name+" "+cat.age+" jashta "+cat.weight+"kg "+cat.bread+" paroda");
        System.out.println(catOne.name+" "+catOne.age+" jashta "+catOne.weight+"kg "+catOne.bread+" paroda");
        System.out.println(buka.name+" "+buka.age+" jashta, color "+buka.color+" "+buka.weight+"kg, "+buka.bread+" paroda");
        System.out.println(tal.species+" darak "+tal.age+"jyl "+tal.place+" jergesinde "+tal.high+" metr");
        System.out.println(telephone.name+" model "+telephone.model+", god"+telephone.year+" "+telephone.charger+"%");
    }
}
