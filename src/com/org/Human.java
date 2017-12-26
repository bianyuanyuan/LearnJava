package com.org;

class BaseException extends Exception {
}

class NewException extends BaseException {
}

public class Human {
    public static void main(String[] args) {
        try {
            throw new NewException();
        } catch (NewException e) {
            System.out.println("NewException");
        } catch (BaseException e) {
            System.out.println("BaseException");
        }

        try {
            throw new NewException();
        } catch (BaseException e) {
            System.out.println("BaseException");
        }

        try {
            throw new NewException();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
