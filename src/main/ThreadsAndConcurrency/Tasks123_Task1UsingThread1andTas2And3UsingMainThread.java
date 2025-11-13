package main.ThreadsAndConcurrency;

class Task1 extends Thread{
    public void run(){
        System.out.println("Task1 Kicked Off");
        System.out.print("Task1 started ");
        for(int i=101;i<=199;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task1 completed ");
    }
}

public class Tasks123_Task1UsingThread1andTas2And3UsingMainThread {
    public static void main(String[] args){
        //task1 and task2 will be executed in parallel
//        Task1 runs in a separate thread (started with task1.start())
//        Task2 runs in the main thread
//        Task3 also runs in the main thread
//        Parallel Execution:
//        Task1 and Task2 will run in parallel since they're on different threads.
//        Task3 will start only after Task2 completes, as they're both in the main thread.
        Task1 task1 = new Task1();
        task1.start();

        //task2
        System.out.println("Task2 Kicked Off ");
        System.out.print("Task2 started ");
        for(int i=201;i<=299;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task2 completed ");

        //task3
        System.out.println("Task3 Kicked Off ");
        System.out.print("Task3 started ");
        for(int i=301;i<=399;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task3 completed ");
    }
}
