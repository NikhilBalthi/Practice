package org.example.customthreadfactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class CustomThreadFactoryEx implements ThreadFactory {

    public static void main(String[] args) {

    }
    ExecutorService executorService = Executors.newFixedThreadPool(1,new CustomThreadFactoryEx());
    ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
    @Override
    public Thread newThread(Runnable runnable) {
        return defaultThreadFactory.newThread(()->{
            try{
                System.out.println("hello ");
                runnable.run();
                System.out.println("hello 123");
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}
