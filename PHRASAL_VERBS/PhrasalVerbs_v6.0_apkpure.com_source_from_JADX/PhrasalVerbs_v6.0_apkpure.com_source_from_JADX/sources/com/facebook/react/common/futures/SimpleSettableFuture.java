package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SimpleSettableFuture<T> implements Future<T> {

    /* renamed from: a */
    private final CountDownLatch f4392a = new CountDownLatch(1);

    /* renamed from: b */
    private T f4393b;

    /* renamed from: c */
    private Exception f4394c;

    /* renamed from: b */
    private void m5746b() {
        if (this.f4392a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    /* renamed from: a */
    public T mo5185a() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void mo5186a(Exception exc) {
        m5746b();
        this.f4394c = exc;
        this.f4392a.countDown();
    }

    /* renamed from: a */
    public void mo5187a(T t) {
        m5746b();
        this.f4393b = t;
        this.f4392a.countDown();
    }

    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    public T get() {
        this.f4392a.await();
        Exception exc = this.f4394c;
        if (exc == null) {
            return this.f4393b;
        }
        throw new ExecutionException(exc);
    }

    public T get(long j, TimeUnit timeUnit) {
        if (this.f4392a.await(j, timeUnit)) {
            Exception exc = this.f4394c;
            if (exc == null) {
                return this.f4393b;
            }
            throw new ExecutionException(exc);
        }
        throw new TimeoutException("Timed out waiting for result");
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return this.f4392a.getCount() == 0;
    }
}
