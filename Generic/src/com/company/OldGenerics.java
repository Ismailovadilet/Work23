package com.company;


public class OldGenerics {
    private Object value;

    public OldGenerics(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "OldGenerics{" +
                "value=" + value +
                '}';
    }
}
