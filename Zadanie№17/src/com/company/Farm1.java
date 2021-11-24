package com.company;

public class Farm1 extends Farm{

    public Farm1(String address, int cows, int horses, int sheep, String ownerName) {
        super(address, cows, horses, sheep, ownerName);
    }


    @Override
    public String toString() {
        return "Farm1\n{" +
                "address='" + getAddress() + '\'' +
                ", cows=" + getCows() +
                ", horses=" + getHorses() +
                ", sheep=" + getSheep() +
                ", ownerName='" + getOwnerName() + '\'' +
                '}';
    }
}