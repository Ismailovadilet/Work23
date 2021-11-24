package com.company;

public class Cup extends Pot {    //Кружка
    private int capacity;


    public Cup(String name, String colour, int capacity) {
        super(name, colour);
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void cup (){
        System.out.println(getName()+" менен чай ичет");
    }
}
