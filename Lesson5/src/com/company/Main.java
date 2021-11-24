package com.company;

public class Main {
    public static void main(String[] args) {
        Pot pot=new Pot("Кастрюль","белый");
        System.out.println(pot.getName()+" цвет "+pot.getColour());
        pot.pot();
        Cup cup=new Cup("Кружка","черный",100);
        System.out.println(cup.getName()+" "+cup.getColour()+" цвет "+cup.getCapacity()+"гр");
        cup.cup();
        Bottle bottle=new Bottle("Бутылка","зеленый",1);
        System.out.println(bottle.getName()+" "+bottle.getColour()+"цвет "+bottle.getCapacity()+"л");
        CartonMilk cartonMilk=new CartonMilk("Молока","белый",200);
        System.out.println(cartonMilk.getName()+" "+cartonMilk.getColour()+" цвет "+cartonMilk.getCapacity()+"гр");
        Container container=new Container("Контейнер","черный",50);
        System.out.println(container.getName()+" "+container.getColour()+" "+container.getCapacity()+"гр");

    }
}

