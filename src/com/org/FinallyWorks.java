package com.org;

class ThreeException extends Exception {
}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("NO Exception");
            } catch (ThreeException e) {//
                System.out.println("ThreeException");
            } catch (Exception e) {
                e.printStackTrace(System.out);
            } finally {
                System.out.println("In finally clause");
                if (count == 2) {
                    break;//out of while
                }
            }
        }
    }
}
