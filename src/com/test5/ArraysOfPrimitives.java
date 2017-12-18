package com.test5;

import java.util.Arrays;
import java.util.Random;

public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = {
                1,
                2,
                3,
                4,
                5,
                6,
        };
        int[] a2;
        //System.out.println("the length of a2 is "+a2.length);// a2 is empty
        a2 = a1;
        for (int i = 0; i < a2.length; i++) {//c++
            a2[i] = a2[i] * 2;//modify the array of a2
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);//see the change of a1

        }
        System.out.println("the length of a1 is " + a1.length);
        Random rand = new Random(47);
        int[] a = new int[rand.nextInt(20)];
        Integer[] b = new Integer[10];
        System.out.println("the length of a is " + a.length);
        System.out.println("the length of b is " + b.length);
        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(500);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        Integer[] arr1 = {
                new Integer(1),
                new Integer(2),
                3,
        };//
        Integer[] arr2 = new Integer[]{
                new Integer(1),
                new Integer(2),
                3,
                4,
        };//
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        //String str = new String[]{"fiddle","de","dum","hello","world",};
        //Other.main(str);
        Other.main(new String[]{"fiddle", "de", "dum", "hello", "world"});
//practice
        String[] string = new String[]{"liming", "xiaoming", "wangfang", "lijun"};
        for (int i = 0; i < string.length; i++) {//show the element of the array
            System.out.println(string[i]);
        }

        PrintString[] ps = new PrintString[10];
        for (int i = 0; i < ps.length; i++) {
            ps[i] = new PrintString("hello");
        }
        System.out.print(Arrays.toString(ps));

    }
}

class Other {
    public static void main(String[] args) {
        for (String s : args) {//
            System.out.print(s + " ");
        }
    }
}

class PrintString {
    public PrintString(String s) {
        System.out.println(s);
    }
}