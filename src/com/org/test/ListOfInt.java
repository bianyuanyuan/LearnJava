package com.org.test;

import java.util.ArrayList;
import java.util.List;

public class ListOfInt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            list.add(2 * i + 1);
        }
        for (int i : list) {//foreach the list
            System.out.print(i + " ");
        }
    }
}
