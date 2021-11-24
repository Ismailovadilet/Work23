package com.company;

public abstract class Farm {
    private String address;
    private int cows;
    private int horses;
    private int sheep;
    private String ownerName;


    public Farm(String address, int cows, int horses, int sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public int getCows() {
        return cows;
    }

    public int getHorses() {
        return horses;
    }

    public int getSheep() {
        return sheep;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + cows +
                ", horses=" + horses +
                ", sheep=" + sheep +
                ", OwnerName='" + ownerName + '\'' +
                '}';
    }
}
