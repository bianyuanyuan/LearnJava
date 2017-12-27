package com.org.test;

public class GenericArray2<T> {
    private Object[] array;

    public GenericArray2(int size) {
        array = new Object[size];
    }

    public void set(int index, T item) {
        array[index] = item;
    }

    @SuppressWarnings("Unchecked")
    public T get(int index) {
        return (T) array[index];
    }

    public T[] rep() {
        return (T[]) array;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> gen = new GenericArray2<Integer>(10);
        for (int i = 0; i < 10; i++) {
            gen.set(i, i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(gen.get(i) + " ");
        }
        System.out.println ();
        try {
            Integer[] it = gen.rep();
        } catch (Exception e) {
            System.out.println(e);
        }
        Object[] obj = gen.rep();
    }
}
