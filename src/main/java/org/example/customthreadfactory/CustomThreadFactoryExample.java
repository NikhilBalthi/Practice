package org.example.customthreadfactory;

public class CustomThreadFactoryExample {
    public static void main(String[] args) {
        CustomThreadFactory threadFactory = new CustomThreadFactory("worker");

        Runnable task =()->{
            System.out.println(Thread.currentThread().getName() + " is running ");
        };

        for(int i=0;i<=3;i++){
            Thread thread = threadFactory.newThread(task);
            thread.start();
        }
    }
}
