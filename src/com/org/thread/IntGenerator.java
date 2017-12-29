package com.org.thread;

import org.jetbrains.annotations.Contract;

public abstract class IntGenerator {
    private volatile boolean cancel = false;

    public abstract int next();

    //allow this to be canceled
    public void cancel() {
        cancel = true;
    }

    @Contract(pure = true)
    public Boolean isCanceled() {
        return cancel;
    }
}
