package com.test6;

class A {

}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
            System.out.println();
        }
    }

    static void printArray2(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
            System.out.println();
        }
    }

    static void f(int required, String... trailing) {
        System.out.print("required:" + required);
        for (String s : trailing) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    static void ff(Character... args) {
        System.out.println(args.getClass());
        System.out.println("length:" + args.length);
    }

    static void g(int... args) {
        System.out.println(args.getClass());
        System.out.println("length:" + args.length);
    }

    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(5),
                new Float(20.4f),
                new Double(11.12),
        });
        printArray(new String[]{
                "one",
                "two",
                "three",
                "four",
        });
        printArray(new Object[]{
                new A(),
                new A(),
                new A(),
        });
        System.out.println("test Object...args");
        printArray2(new Integer(4), new Float(2.53), new Double(4.235));
        printArray2(10, 21.3, 90, "one");
        printArray2();//empty list is ok
        //printArray();//empty list cannot be received
        System.out.println("test-------");
        f(1, " one");
        f(3, " one", "two", "three");
        f(0);

        System.out.println("test--------");
        ff('a','b','c','d','e');
        ff();
        g(1,2,3,4,5,6);
        g();

    }
}
