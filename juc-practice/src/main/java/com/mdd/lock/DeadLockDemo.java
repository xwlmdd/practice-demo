package com.mdd.lock;

public class DeadLockDemo implements Runnable{

    private String lockA;

    private String lockB;

    public DeadLockDemo(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName()+"\t获得了锁");
            synchronized (lockB){
                System.out.println(Thread.currentThread().getName()+"\t获得了锁");
            }
        }
    }

    public static void main (String []args){
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(new DeadLockDemo(lockA, lockB),"AA").start();
        new Thread(new DeadLockDemo(lockB, lockA),"BB").start();
    }
}
