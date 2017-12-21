package com.test8;

//return an instance of an anonymous inner class
public class Parcel7 {
    public Contents contents(){
        return new Contents() {//insert a class definition
            private int i=90;
            @Override
            public int value() {
                return i;
            }
        };//senicolon required in this case
    }
    public static void main(String[] args) {
        Parcel7 p =new Parcel7();
        Contents c=p.contents();
    }
}
