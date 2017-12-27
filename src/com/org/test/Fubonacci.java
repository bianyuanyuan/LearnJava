package com.org.test;

import java.io.FileNotFoundException;

//generate a fibonacci sequence
public class Fubonacci implements Generator<Integer> {
    private int count = 0;

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    @Override
    public Integer next() {
        return fib(count++);
    }

    public static void main(String[] args) {
        Fubonacci fbi = new Fubonacci();
        for (int i = 0; i < 18; i++) {
            System.out.print(fbi.next() + " ");
        }
    }


}
