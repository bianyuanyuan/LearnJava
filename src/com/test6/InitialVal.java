package com.test6;

public class InitialVal {
    boolean x1 = true;
    boolean b;
    byte by;
    char c;
    short s;
    int i;
    long l;
    float fl;
    double db;
    String str;
    InitialVal initialVal;

    void printVal() {
        System.out.println("Data type   Initial value");
        System.out.println("boolean     " + b);
        System.out.println("byte     " + by);
        System.out.println("char     " + c);
        System.out.println("short    " + s);
        System.out.println("int      " + i);
        System.out.println("long     " + l);
        System.out.println("float    " + fl);
        System.out.println("double   " + db);
        System.out.println("String   " + str);
        System.out.println("initialVal   " + initialVal);
    }

    public static void main(String[] args) {
       /* InitialVal in=new InitialVal();
        in.printVal();*/
        new InitialVal().printVal();
    }
}
