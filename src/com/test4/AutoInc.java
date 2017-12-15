package com.test4;

//== or !=
class Integer {
    public int x;

    Integer(int val) {
        x = val;
    }
}

public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i:" + i);
        System.out.println("i++:" + (i++));//i=2
        System.out.println("++i:" + (++i));//i=3
        System.out.println("i:" + i);//i=3
        System.out.println("i--:" + (i--));
        System.out.println("--i:" + (--i));
        System.out.println("i:" + i);
        Integer t1 = new Integer(45);
        Integer t2 = new Integer(45);
        System.out.println(t1 == t2);
        System.out.println(t1.x == t2.x);
        System.out.println(t1 != t2);
        System.out.println(t1.equals(t2));
    }
}
