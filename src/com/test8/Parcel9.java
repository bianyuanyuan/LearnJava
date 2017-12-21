package com.test8;

//a briefer version of Pacel5.java
public class Parcel9 {
    public Destination destination(final String dest, int i) {//dest must be a final
        return new Destination() {
            private String label = dest;
            private int x = i;

            @Override
            public String readLable() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania", 5);
    }
}
