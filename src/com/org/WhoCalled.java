package com.org;

public class WhoCalled {
    static void fmethod() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement.getMethodName());
                //System.out.println(stackTraceElement.getClass());
                //System.out.println(stackTraceElement.getClassName());
            }
        }
    }

    static void g() {
        fmethod();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        fmethod();
        System.out.println("----------------");
        g();
        System.out.println("----------------");
        h();
    }
}
