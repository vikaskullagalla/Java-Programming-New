package main.ThreadsAndConcurrency;

import java.util.concurrent.*;

class CallableTask implements Callable<String> {
    private String name;
    public  CallableTask(String name) {
        this.name = name;
    }
    
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class CallableTaskRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //submit will execute the task and return the result
      Future<String> welcomeFuture =  executorService.submit(new CallableTask1("Vikas"));
      String welcomeMessage = welcomeFuture.get();
      System.out.println(welcomeMessage);

      executorService.shutdown();

    }
}
