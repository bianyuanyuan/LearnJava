package com.test9;

//nested classes (static inner classes)
public class Parce11 {
    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    private static class ParcelDestination implements Destination {
        private String label;

        private ParcelDestination(String label) {
            System.out.println("static ParcelDestination()");
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }

        //nested classes can contain other static elements
        public static void f() {
        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {
            }

            static int x = 10;
        }
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Parel");
    }
}
