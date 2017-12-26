package com.org;

import org.jetbrains.annotations.Contract;

import java.text.RuleBasedCollator;

public class NeverCaught {
    @Contract(" -> fail")
    static void f() {
        //throw new RuntimeException("From f()");
    }

    @Contract(" -> fail")
    static void g() {
        f();
        throw new RuntimeException("From g()");
    }

    @Contract(" -> fail")
    static void h() {
        g();
    }

    @Contract("_ -> fail")
    public static void main(String[] args) {
        h();
    }
}
