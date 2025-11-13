package main.ThreadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Taskk1 extends Thread{
    public void run(){
        System.out.println("Task1 Kicked Off");
        System.out.print("Task1 started ");
        for(int i=101;i<=199;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task1 completed ");
    }
}
class Taskk2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task2 Kicked Off ");
        System.out.print("Task2 started ");
        for(int i=201;i<=299;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task2 completed ");
    }
}

public class ExecutorServiceSingleThreadPool {
    public static void main(String[] args){

        //single thread pool - at a point in time only one thread will be executing
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Taskk3());
        executorService.execute(new Thread(new Taskk4()));

        //if not shutdown, the main thread will not exit
        executorService.shutdown();
    }
}
