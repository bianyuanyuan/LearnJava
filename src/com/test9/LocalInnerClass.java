package com.test9;

//holds a sequenceof objects
interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        //a local inner class

        class LocalInner implements Counter {
            // local inner class have a constructor
            public LocalInner() {
                System.out.println("localinner constructor");
            }

            @Override
            public int next() {
                System.out.println(name);//access local final
                return count++;
            }
        }
        return new LocalInner();
    }

    //the same thing with an anonymous inner class
    Counter getCounter2(final String name) {
        return new Counter() {
            {//only an instance initializer
                System.out.println("Counter()");
            }

            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lc=new LocalInnerClass();
        Counter
                c1=lc.getCounter("local inner"),
                c2=lc.getCounter2("annoymous inner");
        for(int i=0;i<5;i++){
            System.out.println(c1.next());
        }
        for(int i=0;i<5;i++){
            System.out.println(c2.next());
        }
    }
}
