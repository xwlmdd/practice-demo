package com.mdd.lock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 自旋锁
 */
public class SpinlockDemo {

    AtomicReference<Thread> reference = new AtomicReference<>();

    private void mylock() {
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName());
        while (!reference.compareAndSet(null, thread)) {
            System.out.println(Thread.currentThread().getName() + "......wait.....");
        }
    }

    private void unlock() {
        Thread thread = Thread.currentThread();
        reference.compareAndSet(thread, null);
    }

    public static void main(String[] args) {
        SpinlockDemo spinlockDemo = new SpinlockDemo();

        new Thread(() -> {
            spinlockDemo.mylock();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinlockDemo.unlock();
        }, "AA").start();

        new Thread(() -> {
            spinlockDemo.mylock();
            spinlockDemo.unlock();
        }, "BB").start();

    }
}
