package com.org.test;

import com.test9.ClassInInterface;

import java.util.ArrayList;

public class ErasedTypeEqu {
    public static void main(String[] args) {
        Class c1 = new ArrayList<Integer>().getClass();
        Class c2 = new ArrayList<String>().getClass();
        System.out.println(c1 == c2);
    }
}
/*
Output:true
 */