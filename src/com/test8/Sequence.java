package com.test8;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {//outside class
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;//use  object of the outside
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }//inner class

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sq = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sq.add(Integer.toString(i));
        }
        Selector selector = sq.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
