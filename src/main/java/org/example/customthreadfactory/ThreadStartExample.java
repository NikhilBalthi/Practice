package org.example.customthreadfactory;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " is running" );
    }
}

public class ThreadStartExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        System.out.println(" main thread before staring new thread");
        thread.start();

        System.out.println("main thread is running ");
    }
}
