package com.test4;

import java.util.Random;

import static jdk.nashorn.internal.objects.Global.print;

public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random();
        //Random rand = new Random(47);
        int j, k;
        //choose value from 1 to 100
        j = rand.nextInt(100) + 1;
        System.out.println("j:" + j);
        k = rand.nextInt(100) + 1;
        //print("k:"+k);
        System.out.println("k:" + k);
        //print("j+k:"+i);
        System.out.println("j+k:" + (j + k));
        System.out.println("j-k:" + (j - k));
        System.out.println("j*k:" + (j * k));
        System.out.println("j/k:" + (j / k));
        System.out.println("j%k:" + (j % k));
        float u, v;//the following also works for char,byte,short,int,long,and double
        u = rand.nextFloat();
        v = rand.nextFloat();
        System.out.println("u+v:" + (u + v));
        System.out.println("u-v:" + (u - v));
        System.out.println("u*v:" + (u * v));
        System.out.println("u/v:" + (u / v));
    }
}
