package com.test3;

public class Num {

    public static String string = "static";//a static string
    public String string1 = "unkonwn";

    public static void getString() {
        System.out.println("static method");
        string = "hello";
        //string1="ok";
    }

    public void getString1() {
        System.out.println("not a static method");
        string = "hello2";
        string1 = "ok";
    }

    public static void main(String[] args) {
        /*long num = 123456667778787887L;//a long number
        short a = 1;
        short b = 2;
        int c = a + b;//a+b
        System.out.println(c);//
        System.out.println(num);*/
        Num num1 = new Num();
        getString();
        num1.getString1();
        string = "hi";//modify the string
        System.out.println(string);
        System.out.println(num1.string1);
    }
}
