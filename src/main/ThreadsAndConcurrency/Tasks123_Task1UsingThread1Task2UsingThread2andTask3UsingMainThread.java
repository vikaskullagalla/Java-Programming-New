package main.ThreadsAndConcurrency;

class TaskOne extends Thread{
    public void run(){
        System.out.println("Task1 Kicked Off");
        System.out.print("Task1 started ");
        for(int i=101;i<=199;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task1 completed ");
    }
}

class TaskTwo implements Runnable{
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

public class Tasks123_Task1UsingThread1Task2UsingThread2andTask3UsingMainThread {
    public static void main(String[] args){
        //first TaskOne will be executed; then task2; then task3
        //each task will be executed one after the other
        //even though CPU is executing only TaskOne, it will not execute other tasks because it doesn't know that other tasks are waiting to be executed
        //TaskOne
        TaskOne taskOne = new TaskOne();
        taskOne.start();
        
        //task2
        TaskTwo taskTwo = new TaskTwo();
        Thread taskTwothread = new Thread(taskTwo);
        taskTwothread.start();

        //task3
        System.out.println("Task3 Kicked Off ");
        System.out.print("Task3 started ");
        for(int i=301;i<=399;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task3 completed ");
    }
}

//Parallel Execution:
//Task1 (in its own thread) and Task2 (in its own thread) and Task3 (in the main thread) will all run in parallel.
//Key Points:
//Task1 starts in a separate thread with taskOne.start()
//Task2 starts in another thread with taskTwothread.start()
//Task3 runs in the main thread
//Execution Flow:
//All three tasks will run concurrently.
//The order of execution between them is not guaranteed.
//The main thread (Task3) will continue executing without waiting for Task1 or Task2 to complete.
