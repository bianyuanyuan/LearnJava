package com.org.test;

import java.util.*;
import java.util.LinkedList;

public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> list() {
        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> llist() {
        return new LinkedList<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }
}

class Test {//test

    public static void main(String[] args) {
        Map<String, Integer> m = New.map();
        m.put("gii", 90);
        m.put("hi", 78);
        m.put("gii", 10);
        System.out.println(m.get("hi"));
        List<String> l = New.list();
        l = New.llist();
        Queue<Double> doubles = New.queue();
    }
}