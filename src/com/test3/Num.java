package com.test3;

import java.math.BigDecimal;
import java.math.BigInteger;

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

        char c = 'x';
        Character ch = new Character(c);
        Character c1 = 'x';
        char c2 = c1;
        BigInteger x = new BigInteger("12333333243242442222222222222233333334444444433334444444444444444333333333333");
        BigDecimal y = new BigDecimal("123.2222222222222222222224124444444444444122233333333333333333333333333333333334");
        BigInteger[] zAarray = new BigInteger[10];
        for (int i = 0; i < zAarray.length; i++) {
            zAarray[i] = x;
            //zAarray[i]=x++;
        }
        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < zAarray.length; i++) {
            System.out.println(zAarray[i]);
        }

        {
            int i = 89;//only i available
            {
                int q = 7;//both i,q available
            }
            //only i available
            //q is out of scope
        }

        {
            String s=new String("a string");
        }//end of scope

    }
}
