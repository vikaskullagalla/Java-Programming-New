package main.ThreadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Taskk3 extends Thread{
    public void run(){
        System.out.println("Task3 Kicked Off");
        System.out.print("Task3 started ");
        for(int i=301;i<=399;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task3 completed ");
    }
}
class Taskk4 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task4 Kicked Off ");
        System.out.print("Task4 started ");
        for(int i=401;i<=499;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task4 completed ");
    }
}

class Task5 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task5 Kicked Off ");
        System.out.print("Task5 started ");
        for(int i=501;i<=599;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task5 completed ");
    }
}

class Task6 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task6 Kicked Off ");
        System.out.print("Task6 started ");
        for(int i=601;i<=699;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task6 completed ");
    }
}

public class ExecutorServicenewFixedThreadPool {
    public static void main(String[] args){

        //single thread pool - at a point in time only one thread will be executing
        ExecutorService executorService = Executors.newFixedThreadPool(2);//at any point in time only two threads will be executing
        executorService.execute(new Taskk3());
        executorService.execute(new Thread(new Taskk4()));
        executorService.execute(new Thread(new Task5()));
        executorService.execute(new Thread(new Task6()));

        //task7
        System.out.println("Task7 Kicked Off ");
        System.out.print("Task7 started ");
        for(int i=301;i<=399;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task7 completed ");

        //if not shutdown, the main thread will not exit
        executorService.shutdown();
    }
}
