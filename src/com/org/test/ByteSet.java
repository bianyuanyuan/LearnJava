package com.org.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ByteSet {
    Byte[] pos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Set<Byte> mySet = new HashSet<Byte>(Arrays.asList(pos));
    //!Set<Byte> mySet2 = new HashSet<>(Arrays.<Byte>asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
}
