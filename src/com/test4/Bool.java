package com.test4;

import java.util.Random;

public class Bool {
    public static void main(String[] args) {
        Random random = new Random(47);
        int i = random.nextInt(100);
        int j = random.nextInt(100);
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));
        //!System.out.print("i && j is" + (i && j));
        //!System.out.print("i || j is" + (i || j));
        //!System.out.print("!i is" + (!i));
        System.out.println("(i<10) && (j<10) is " + ((i<10) && (j<10)));
        System.out.println("(i<10) || (j<10) is " + (i<10 && j<10));
    }
}
