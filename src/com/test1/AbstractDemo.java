package com.test1;

import java.awt.*;

public class AbstractDemo {
    public static void main(String[] args) {
        Salary e = new Salary("wangfang", "hunan,changsha", 45, 1200.0);
        Employee s = new Salary("Tom", "American,NK", 34, 3000.0);
        e.mailCheck();
        s.mailCheck();
        System.out.println(s.toString());
        System.out.println(s.computePay());
    }
}
