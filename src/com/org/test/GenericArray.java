package com.org.test;

public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("Unchecked")
    public GenericArray(int size) {
        array = (T[]) new Object[size];
        // array = (T[]) new Integer[size];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> age = new GenericArray<Integer>(10);
        try {
            Integer[] ia = age.rep();
        } catch (Exception e) {
            System.out.println(e);
        }
        Object[] obj = age.rep();
    }
}
