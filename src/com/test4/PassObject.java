package com.test4;
class Letter {
    char c;
}
public class PassObject {
    static  void f(Letter y) {
        y.c='y';
    }
    public static void main(String[] args) {
        Letter x=new Letter();
        Letter x1=new Letter();
        x.c='a';
        f(x);

    }
}
