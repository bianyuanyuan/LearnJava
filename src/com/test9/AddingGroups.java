package com.test9;

import java.util.*;

//adding groups of elements to Collection objects
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));//add
        Integer[] moreInts = {
                6,
                7,
                8,
                9,
                10,
        };
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);

        List<Integer> list = Arrays.asList(16, 17, 18, 19,20);
        list.set(1,99);
        //!list.add(21);

    }
}
