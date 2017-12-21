package com.test8;

import javax.management.DynamicMBean;
import java.util.Random;

public interface RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextLong() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}

class TestRandVals {
    public static void main(String[] args) {
        //!RandVals.RANDOM_INT=0;//----final & static
        System.out.println(RandVals.RANDOM_INT);//-----public
        System.out.println(RandVals.RANDOM_LONG);
        System.out.println(RandVals.RANDOM_FLOAT);
        System.out.println(RandVals.RANDOM_DOUBLE);
    }
}