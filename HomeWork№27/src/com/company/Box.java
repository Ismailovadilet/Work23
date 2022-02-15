package com.company;

public class Box<T1, T2, T3> {
    private T1 value1;
    private T2 value2;
    private T3 value3;

    public Box(T1 value1, T2 value2, T3 value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public static Box generic() {
        Box<Integer, Integer, Integer> box1 = new Box<>(10, 15, 20);
        return box1;
    }

    @Override
    public String toString() {
        return "Box{" + "value1=" + value1 + ":" +
                "\nBox{" + "value2=" + value2 + ":" +
                "\nBox{" + "value3=" + value3 + ":";
    }
}
