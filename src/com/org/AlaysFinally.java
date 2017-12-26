package com.org;

class FourException extends Exception {
}

public class AlaysFinally {
    public static void main(String[] args) {
        System.out.println("Enter first try block");//1
        try {
            System.out.println("Enter second try block");//2
            try {
                throw new FourException();
            } finally {
                System.out.println("finally in 2st try block");//3
            }
        } catch (FourException e) {
            System.out.println("Caught FourException in 1st try block");//4
        } finally {
            System.out.println("finally in 1st try block");//5
        }
    }
}
