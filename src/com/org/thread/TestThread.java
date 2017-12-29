package com.org.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestThread implements Runnable {
    private static int i = 0;

    public static void main(String[] args) {
        /*TestThread t = new TestThread(100);
        t.run();*/

        /*Thread t=new Thread(new TestThread());
        t.start();*/

        /*for (int i = 0; i < 9; i++) {
            new Thread(new TestThread()).start();
        }*/

       /* ExecutorService exe= Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            exe.execute(new TestThread());
        }
        exe.shutdown();*/

        ExecutorService exe = Executors.newCachedThreadPool();
        exe.execute(new TestThread());
        exe.shutdown();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("test " + i);
            Thread.yield();
        }
    }


}
