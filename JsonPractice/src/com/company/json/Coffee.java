package com.company.json;

public class Coffee {
    private String name;
    private int price;
    private CupSize cupSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CupSize getCupSize() {
        return cupSize;
    }

    public void setCupSize(CupSize cupSize) {
        this.cupSize = cupSize;
    }

    public static Coffee makeCoffee(String name, int price, CupSize size) {
        Coffee coffee = new Coffee();
        coffee.name = name;
        coffee.price = price;
        coffee.cupSize = size;
        return coffee;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cupSize=" + cupSize +
                '}';
    }
}
