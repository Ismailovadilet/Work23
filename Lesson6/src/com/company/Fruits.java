package com.company;

public abstract class Fruits {
    private String name;
    private String colour;
    private double weight;
    private boolean isEdible;
    private boolean isOrganic;



    public Fruits(String name, String colour, double weight, boolean isEdible, boolean isOrganic) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.isEdible = isEdible;
        this.isOrganic = isOrganic;
    }

    public abstract void getImport();
    public abstract void getPrice();

    public boolean check(boolean isEdible){
        if (isEdible==true){
            System.out.println(name+ " жегенге болот");
        }else {
            System.out.println(name + " жегенге болбойт");
        }
        return isEdible;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public boolean isOrganic() {
        return isOrganic;
    }
}
