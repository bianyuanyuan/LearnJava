package com.test6;

import org.jetbrains.annotations.Contract;

//test the issue of shortcircuit
public class ShortCircuit {
    @Contract(pure = true)
    static boolean test1(int v) {
        System.out.println("test1");
        return v < 1;
    }

    @Contract(pure = true)
    static boolean test2(int v) {
        System.out.println("test2");
        return v < 2;
    }

    @Contract(pure = true)
    static boolean test3(int v) {
        System.out.println("test3");
        return v < 3;
    }

    public static void main(String[] args) {
        boolean b = test1(-1) && test2(1) && test3(2);
        System.out.println(b);
        int arr[] = {
                1,
                new Integer(2),
                3,
                4,
                5,
                new Integer(6),
                7,
                8,
        };
        for (int i : arr) {
            System.out.println(arr[i - 1]);
        }
    }
}

