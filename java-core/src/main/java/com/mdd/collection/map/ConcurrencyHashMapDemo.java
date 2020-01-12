package com.mdd.collection.map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyHashMapDemo {

//    private static ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    private static ExecutorService executorService = Executors.newFixedThreadPool(100);

    private static HashMap hashMap = new HashMap();

    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("name","xwl");
        System.out.println(concurrentHashMap.get("name"));


//        int n = 16;
//        int result = n - (n >>> 2);
//        System.out.println(result);
//        AtomicStampedReference atomicStampedReference = new AtomicStampedReference(1,2);
//        try {
//            atomicStampedReference.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        while (true){
//            executorService.submit(new Runnable() {
//                public void run() {
//                    double random = Math.random();
//                    concurrentHashMap.put(random, random);
//                    System.out.println("concurrentHashMap[][][]"+random);
//                    System.out.println(concurrentHashMap.get(random));
//                }
//            });
//        }

//        while (true){
//            executorService.submit(new Runnable() {
//                public void run() {
//                    double random = Math.random();
//                    hashMap.put(random, random);
//                    System.out.println("hashMap[][][]"+random);
//                    System.out.println(hashMap.get(random));
//                }
//            });
//        }

    }

}
