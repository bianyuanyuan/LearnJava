package com.test6;

class Bowl {
    Bowl(int maker) {
        System.out.println("Bowl(" + maker + ")");
    }

    void f1(int maker) {
        System.out.println("f1(" + maker + ")");
    }

}

class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table");
        bowl2.f1(1);
    }

    void f2(int maker) {
        System.out.println("f2(" + maker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class CupBoard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    CupBoard() {
        System.out.println("CupBoard()");
        bowl4.f1(2);
    }

    void f3(int maker) {
        System.out.println("f3(" + maker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialzation {
    public static void main(String[] args) {
        System.out.println("create the new cupboard in main");
        new CupBoard();
        System.out.println("create the new cupboard in main");
        new CupBoard();
        table.f2(1);
        cupBoard.f3(1);

        //test cups
        System.out.println("Inside main-------");
        Cups.cup1.f(99);

        //test
        System.out.println("Inside--------");
        new Mus();
        System.out.println("Inside---------");
        new Mus(1);
    }

    static Table table = new Table();
    static CupBoard cupBoard = new CupBoard();
}

class Cup {
    Cup(int i) {
        System.out.println("Cup(" + i + ")");
    }

    void f(int i) {
        System.out.println("f(" + i + ")");
    }
}

class Cups {//test static inital
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

class Mus {//not a static
    Cup cup3;
    Cup cup4;

    {
        cup3 = new Cup(3);
        cup4 = new Cup(4);
        System.out.println("cup3&cup4");
    }

    Mus() {
        System.out.println("Mugs()");
    }

    Mus(int i) {
        System.out.println("Mus(int)");
    }
}