package main.ThreadsAndConcurrency;

import java.util.List;
import java.util.concurrent.*;

class CallableTask1 implements Callable<String> {
    private String name;
    public CallableTask1(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class MultipleCallableTaskRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask1> tasks = List.of(new CallableTask1("Vikas"), new CallableTask1("Kullagalla"), new CallableTask1("TCS"), new CallableTask1("Java"),new CallableTask1("Spring"));

        //UNCOMMENT TO RUN INVOKE ALL
        /*
        //invokeAll will execute all the tasks and return the results
        List<Future<String>> results = executorService.invokeAll(tasks);
        for(Future<String> result:results){
            System.out.println(result.get());
        }
        */

        //invokeAny will execute any one of the tasks and return the result
        //pass in a collection of tasks that extends Callable<T> it will execute any one of them and return the result
        String result = executorService.invokeAny(tasks);
        System.out.println(result);

        executorService.shutdown();
    }
}

