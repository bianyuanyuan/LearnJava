package com.org.test;

import java.util.List;

interface Payable<T> {
}

class Employee implements Payable<Employee> {
}

/*
class Hourly extends Employee implements Payable<Hourly>{//cannot compile
}*/
class A implements Payable {
}

class B extends A implements Payable {//can compile
}

public class MultipleInterfaceVariants {
    public static void main(String[] args) {
    }
}

class UseList<W, T> {
    void f(List<W> w) {
    }

    /*void f(List<T> t) {//can not compile
    }*/

    void g(List<T> t) {
    }
}
