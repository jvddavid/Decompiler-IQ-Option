package com.google.common.util.concurrent;

class AbstractFuture$Failure$1 extends Throwable {
    AbstractFuture$Failure$1(String str) {
        super(str);
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
