package com.company.animal;

public class Oceanarium {
    private Shark[] sharks;
    private Duck[] ducks;
    private Turtle[] turtles;

    public Oceanarium() {

    }

    @Override
    public String toString() {
        return "Oceanarium:" +
                " sharks=5" +
                " ducks=5" +
                " turtles=5";
    }
}
