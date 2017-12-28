package com.org.concurrency;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

//Demonstration of the Runnable interface
public class LiftOff implements Runnable {
    protected int countDown = 10;//Default
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ").";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            try {
                TimeUnit.SECONDS.sleep(1);
                Thread.yield();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        LiftOff lf = new LiftOff();
        lf.run();
    }
}
