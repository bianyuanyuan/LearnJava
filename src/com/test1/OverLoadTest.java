package com.test1;

public class OverLoadTest {
    public static int add(int a, int b) {//a method
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a) {
        return a++ + ++a;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static int add(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static short add(short a, short b) {
        return (short) (a + b);

    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(OverLoadTest.add(10));
        System.out.println(add(10, 2.1));
        System.out.println(add(2.3, 10));
        System.out.println(add(1234718743222L, 364765422222L));
        System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(add(new int[]{1, 2, 3, 4, 5}));
        System.out.println(add("hello", "world"));
        System.out.println(add(1, 2));
    }
}
