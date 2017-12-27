package com.org.test;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IterableFib extends Fubonacci implements Iterable<Integer> {
    private int n;

    public IterableFib(int n) {
        this.n = n;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFib.this.next();
            }
        };
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
       for(int i:new IterableFib(18)){
           System.out.print(i+" ");
       }
    }
}
