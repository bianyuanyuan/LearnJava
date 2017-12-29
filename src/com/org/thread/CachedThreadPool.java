package com.org.thread;

import com.org.concurrency.LiftOff;

import java.util.concurrent.*;

public class CachedThreadPool {
    public static void main(String[] args) {
       /* ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
        ExecutorService exe = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            exe.execute(new LiftOff());
        }
        exe.shutdown();*/

        ExecutorService exe1=Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++){
            exe1.execute(new LiftOff());
        }
        exe1.shutdown();
    }
}
