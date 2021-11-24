package com.company;

public class Programmer extends Person{
    private String companyName;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        System.out.println(getName() +" learn programming");
    }

    @Override
    public void walk() {
        System.out.println(getName()+" goes to peaksoft");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a hamburger");
    }

    public void coding(){
        System.out.println(getName()+" writes coding");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
