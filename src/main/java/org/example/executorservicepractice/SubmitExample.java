package org.example.executorservicepractice;

import java.util.concurrent.*;

public class SubmitExample {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> task = ()->{
            int sum = 0;
            for(int i = 0;i<=5; i++){
                sum+=i;
                System.out.println(" submit example" +i);
            }
            return sum;
        };

        Future<Integer> future = executorService.submit(task);

        try {
            int result = future.get();
        }catch (Exception e){
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
