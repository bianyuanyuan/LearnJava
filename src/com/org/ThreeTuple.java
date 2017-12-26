package com.org;

import org.jetbrains.annotations.NotNull;

import javax.jws.Oneway;

public class ThreeTuple<A, B, C> {
    public final A a;
    public final B b;
    public final C c;

    public ThreeTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + "," + c + ")";
    }
}

class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    public final D d;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + "," + c + "," + d + ")";
    }
}

class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
    public final E e;

    public FiveTuple(A a, B b, C c, D d, E e) {

        super(a, b, c, d);
        this.e = e;
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + "," + c + "," + d + "," + e + ")";
    }
}

class TupleTest {
    @NotNull
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("hi", 47);
    }

    @NotNull
    static ThreeTuple<Automobile, String, Integer> g() {
        return new ThreeTuple<>(new Automobile(), "hi", 67);
    }

    @NotNull
    static FourTuple<Automobile, String, Integer, Double> h() {
        return new FourTuple<>(new Automobile(), "hi", 67, 45.3);
    }

    @NotNull
    static FiveTuple<Automobile, String, Integer, Double, Character> w() {
        return new FiveTuple<>(new Automobile(), "hi", 67, 45.3, 'b');//
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> tt = f();
        //!tt.first="there";//cannot compile
        System.out.println(tt.first);
        System.out.println(tt);
        System.out.println(g());
        System.out.println(h());
        System.out.println(w());
    }
}