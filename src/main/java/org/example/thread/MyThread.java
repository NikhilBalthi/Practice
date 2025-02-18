package org.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(" example 1 ");
    }

    private static void executeRunnable(){
        Runnable task = ()->{
            System.out.println("hello i am runnable task");
        };
        Thread thread = new Thread(task);
        thread.start();
    }

    private static void executeExecutor(){

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(()-> System.out.println("I am inside executor task"+currentThread().getName()));

        service.shutdown();

    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();


        executeRunnable();

        executeExecutor();

        System.out.println("current thread "+currentThread().getName());

    }
}
