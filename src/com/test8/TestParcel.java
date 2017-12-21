package com.test8;

//innerclasses
interface Destination {
    String readLable();
}

interface Contents {
    int value();
}

class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    private class PDestination implements Destination {
        private String label1;

        private PDestination(String whereTo) {
            label1 = whereTo;
        }

        @Override
        public String readLable() {
            return label1;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");

        //! Parcel4.PContents pc=p.new PContents();//cannot access private class
    }
}
