package com.company;

public class NewGenerics <T>{
    private T value;

    public NewGenerics(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NewGenerics:" +
                "value=" + value ;

    }
}
