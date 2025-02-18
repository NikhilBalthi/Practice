package org.example.executorservicepractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicePrac {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        System.out.println("\n Fixed Thread Pool");
        for(int i=0;i<=5;i++){
            final int taskId = i;
            fixedThreadPool.execute(()->{
                System.out.println("Fixed Thread task "+taskId +
                        "executed by thread "+Thread.currentThread().getName());
            });
        }
        fixedThreadPool.shutdown();
    }
}
