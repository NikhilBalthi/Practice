package org.example.executorservicepractice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecOne {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> submit = executorService.submit(() -> 41);
        if(submit.isDone()){
            System.out.println("yes, the task is done! ");
        }
        System.out.println(submit);
        if(submit.isDone()){
            System.out.println("yes, the task is done! ");
        }
        System.out.println("Is Done ?"+submit.isDone());
        Integer i = submit.get();
        System.out.println("get operation has been done");
        System.out.println("is Done now ? "+submit.isDone());
        if(submit.isDone()){
            System.out.println("yes, the task is done! ");
        }
        System.out.println("the value is "+i);
    }
}
