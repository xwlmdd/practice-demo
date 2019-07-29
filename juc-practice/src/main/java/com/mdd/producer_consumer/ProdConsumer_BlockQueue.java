package com.mdd.producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ProdConsumer_BlockQueue {

    /**
     *  资源计数
     */
    private AtomicInteger resourceNum = new AtomicInteger();

    /**
     * 默认开启 进行生产消费的交互
     */
    private volatile boolean isFull = true;

    private BlockingQueue<Integer> blockingQueue;

    public ProdConsumer_BlockQueue(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    /**
     * 生产
     */
    private void produce() throws InterruptedException {
        while (isFull){
            Thread.sleep(1000);
            blockingQueue.put(resourceNum.incrementAndGet());
            System.out.println(Thread.currentThread().getName()+" 生产了\t"+resourceNum.get());
        }
    }

    private void consume() throws InterruptedException {
        while (isFull){
            blockingQueue.take();
            System.out.println(Thread.currentThread().getName()+" 消费了\t"+resourceNum.get());

        }
    }


    public static void main (String []args){
        ProdConsumer_BlockQueue prodConsumer_blockQueue = new ProdConsumer_BlockQueue(new ArrayBlockingQueue<Integer>(1) {
        });
        new Thread(()->{
            while (true){
                try {
                    prodConsumer_blockQueue.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"AA").start();

        new Thread(()->{
            while (true){
                try {
                    prodConsumer_blockQueue.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"BB").start();
    }


}