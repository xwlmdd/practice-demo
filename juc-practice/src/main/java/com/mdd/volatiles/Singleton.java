package com.mdd.volatiles;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton {

    // 禁止创建单例对象时指令重排序
    private static volatile Singleton singleton = null;

    private Singleton() {
        System.out.println(Thread.currentThread().getName());
    }

    public synchronized static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        while (true){
            executorService.submit(() -> {
                Singleton.getInstance();
            });
        }

    }

}
