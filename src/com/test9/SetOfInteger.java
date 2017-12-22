package com.test9;

import java.util.*;

//example
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        //LinkedHashSet test
        Set<Integer> intset = new LinkedHashSet<Integer>();
        for(int i=0;i<10000;i++){
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);

        //HashSet test
        Set<Integer> intset2 = new HashSet<Integer>();
        for(int i=0;i<10000;i++){
            intset2.add(rand.nextInt(30));
        }
        System.out.println(intset2);

        //TreeSet test
        Set<Integer> intset1 = new TreeSet<>();
        for(int i=0;i<10000;i++){
            intset1.add(rand.nextInt(30));
        }
        System.out.println(intset1);
    }
}
