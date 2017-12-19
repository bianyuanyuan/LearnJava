package com.test6;

class Clock {
    int count;

    Clock() {
        System.out.println("Clock" + " ");
    }

    Clock(int i) {
        System.out.println("Clock" + i);
    }

    public void arlm(int i) {
        System.out.println(i);
    }

    Clock increment() {
        count++;
        return this;
    }

    void print() {
        System.out.println("count=" + count);
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Clock();
            new Clock(i);
        }
        Clock c1 = new Clock(), c2 = new Clock();
        c1.arlm(1);// Clock.arlm(c1,1);
        c2.arlm(2);//Clock.arlm(c2,2);

        Clock c3=new Clock(3);
        c3.increment().increment().increment().increment().print();
    }
}
