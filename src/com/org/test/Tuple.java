package com.org.test;
//
import com.org.*;
import org.jetbrains.annotations.NotNull;

public class Tuple {
    @NotNull
    public static <A, B, C> ThreeTuple<A, B, C> threeTuple(A a, B b, C c) {
        return new ThreeTuple<A, B, C>(a, b, c);
    }
}

class TestTuple {
    @NotNull
    static ThreeTuple<String, Integer, Double> f() {
        return Tuple.threeTuple("hi", 12, 12.5);
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}