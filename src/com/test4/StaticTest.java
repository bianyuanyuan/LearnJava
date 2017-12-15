package com.test4;

/**
 * @author bianyy
 */
public class StaticTest {
    public static int i;//i=0

    public static void main(String[] args) {
        StaticTest s1 = new StaticTest();
        StaticTest s2 = new StaticTest();
        i = 45;
        StaticTest.i++;
        int x = s1.i;
        Increamtable inc = new Increamtable();
        inc.increamtable();
        Increamtable.increamtable();
        System.out.println("i=" + i);
        System.out.println("x=" + x);
        System.out.println(new Date());
    }
}

class Increamtable {
    public static void increamtable() {
        StaticTest.i++;
    }
}