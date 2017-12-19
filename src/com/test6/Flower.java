package com.test6;

public class Flower {
    int size = 0;
    String s = "initial";

    Flower(int val) {
        size = val;
        System.out.println("Flower(int)" + size);
    }

    Flower(String str) {
        System.out.println("Flower(String)" + str);
        s = str;
    }

    Flower(String str, int val) {
        this(val);
        //this(str);//cannot call two
        System.out.println("Flower(Stirng,int)");
        this.s = str;
    }

    Flower() {
        this("hi", 47);
        //this(s,size);
        System.out.println("Flower()");
    }

    void print() {
        //this(10);//cannot use in this way
        System.out.println("size="+size+"s="+s);
    }

    public static void main(String[] args) {
    Flower flower=new Flower();
    flower.print();
    }
}
