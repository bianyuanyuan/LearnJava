package com.org.test;

import java.util.ArrayList;
import java.util.List;

public class ListOfGenerics<T> {
    //!T []array=new T[10];//cannot create an array
    private List<T> list = new ArrayList<T>();

    public void add(T item) {
        list.add(item);
    }

    public T get(int index) {
        return list.get(index);
    }
}

class Generic<T> {
}

class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] age;//can compile

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //! age=(Generic<Integer>[]) new Object[SIZE];.//ArrayOfGeneric
        age = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(age.getClass().getSimpleName());
        age[0] = new Generic<Integer>();
        //!age[1]=new Object();//can not compile
        //!age[2]=new Generic<Double>();
    }
}