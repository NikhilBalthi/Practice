package org.example.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Function;

public class FunctionCallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Function<Integer, Integer> multiply = x-> x*x;
        
        Function<Integer,Integer> sum = x->x+x;

        List<Function<Integer, Integer>> functions = Arrays.asList(multiply, sum);

        List<Integer> results = new ArrayList<>();

        for(Function<Integer,Integer> function:functions){
            results.add(function.apply(4));
        }

        System.out.println("results are "+results);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> tasks = new ArrayList<>();

        for(Function<Integer,Integer> function:functions){
            tasks.add(()->function.apply(4));
        }

        List<Future<Integer>> futureResults = executorService.invokeAll(tasks);
        for(Future<Integer> f:futureResults){
            System.out.println("f result is "+f.get());
        }

    }
}
