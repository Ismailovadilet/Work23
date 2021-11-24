package com.company;

public class Farm2 extends Farm{

    public Farm2(String address, int cows, int horses, int sheep, String ownerName) {
        super(address, cows, horses, sheep, ownerName);

    }

    @Override
    public String toString() {
        return "Farm2\n{" +
                "address='" + getAddress() + '\'' +
                ", cows=" + getCows() +
                ", horses=" + getHorses() +
                ", sheep=" + getSheep() +
                ", ownerName='" + getOwnerName() + '\'' +
                '}';
    }
}
