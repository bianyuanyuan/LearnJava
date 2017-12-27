package com.org.test;

import java.util.*;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Integer> its = fill(new ArrayList<Integer>(), new Fubonacci(), 19);
        for (int i : its) {
            System.out.print(i + " ");
        }
    }
}
