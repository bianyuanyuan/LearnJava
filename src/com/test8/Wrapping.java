package com.test8;

public class Wrapping {
    private int i;

    public Wrapping(int x) {
        i = x;
    }

    public int value() {
        return i;
    }
}

class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;//base constructor call
            }
        };//semicolon required
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(12);
    }
}