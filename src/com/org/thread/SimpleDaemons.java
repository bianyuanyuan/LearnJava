package com.org.thread;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

//daemon threads don't prevent the program from ending
public class SimpleDaemons implements Runnable {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new SimpleDaemons());
            t.setDaemon(true);//must call before start()
            t.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.println("Sleep() interrupted");
        }
    }
}
