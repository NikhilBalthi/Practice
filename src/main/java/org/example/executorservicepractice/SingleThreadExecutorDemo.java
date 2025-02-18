package org.example.executorservicepractice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.newSingleThreadExecutor;

public class SingleThreadExecutorDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try{
            for(int i=0;i<10;i++){
                service.execute(new Task(i));
            }
        }finally
            {
                service.shutdown();
            }
        }
    }


class Task implements Runnable {
    private final int taskId;

    Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        // Task behavior
        System.out.println("Task " + taskId + " is running...");
    }
}
