package org.example.executorservicepractice;

import com.sun.org.apache.xml.internal.resolver.helpers.FileURL;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecTwo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> callable = ()->{
            System.out.println("task1");
            return 1;
        };
        Callable<Integer> callable1 = ()->{
            System.out.println("task 2");
            return 2;
        };
        Callable<Integer> callable2 = ()->{
            System.out.println("task 3");
            return 3;
        };

        //code
        List<Callable<Integer>> list = Arrays.asList(callable, callable1, callable2);

        List<Future<Integer>> futures = executorService.invokeAll(list);
        for(Future<Integer> f: futures){
            System.out.println(f.get());
        }
        executorService.shutdown();

        System.out.println("hello world");

    }
}
