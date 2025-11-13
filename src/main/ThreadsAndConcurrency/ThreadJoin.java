package main.ThreadsAndConcurrency;

class TaskOne11 extends Thread{
    public void run(){
        System.out.println("Task1 Kicked Off");
        System.out.print("Task1 started ");
        for(int i=101;i<=199;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task1 completed ");
    }
}

class TaskTwo11 implements Runnable{
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

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        //task1
        TaskOne11 taskOne = new TaskOne11();
        taskOne.start();

        //task2
        TaskTwo11 taskTwo = new TaskTwo11();
        Thread taskTwothread = new Thread(taskTwo);
        taskTwothread.start();

        taskOne.join();
        taskTwothread.join();
        //join() will make the main thread wait for task1 and task2 to complete
        //task1 and task2 will run in parallel
        //task3 will run after task1 and task2 are completed
        //task3
        System.out.println("Task3 Kicked Off ");
        System.out.print("Task3 started ");
        for(int i=301;i<=399;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task3 completed ");
    }
}