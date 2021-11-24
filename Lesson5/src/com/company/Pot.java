package com.company;

public class Pot {        //Каструль
    private String name;
    private String colour;



    public Pot(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Pot{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }public void pot (){
        System.out.println(name+ "га тамак жасалат");
    }
}
