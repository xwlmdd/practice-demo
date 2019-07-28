package com.mdd.producer_consumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 资源类
 */
class Resource {
    // 共享资源
    private Integer resourceNum = new Integer(0);

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void produce() throws InterruptedException {
        lock.lock();
        while (resourceNum != 0) {
            condition.await();
        }
        try {
            resourceNum++;
            System.out.println(Thread.currentThread().getName() + "生产了\t" + resourceNum);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void consume() throws InterruptedException {
        lock.lock();
        while (resourceNum == 0) {
            condition.await();
        }
        try {
            resourceNum--;
            System.out.println(Thread.currentThread().getName() + "消费了\t" + resourceNum);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}

public class ProdConsumer_TraditionalDemo {
    public static void main(String[] args) {
        Resource resource = new Resource();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    resource.produce();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AA").start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    resource.consume();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "BB").start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    resource.consume();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "CC").start();


    }
}
