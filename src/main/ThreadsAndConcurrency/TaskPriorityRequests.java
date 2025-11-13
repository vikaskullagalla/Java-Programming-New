package main.ThreadsAndConcurrency;

class TaskOne1 extends Thread{
    public void run(){
        System.out.println("Task1 Kicked Off");
        System.out.print("Task1 started ");
        for(int i=101;i<=199;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task1 completed ");
    }
}

class TaskTwo1 implements Runnable{
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

public class TaskPriorityRequests {
    public static void main(String[] args){
        TaskOne1 taskOne = new TaskOne1();
        taskOne.setPriority(10);
        taskOne.start();

        //task2
        TaskTwo1 taskTwo = new TaskTwo1();
        Thread taskTwothread = new Thread(taskTwo);
        taskTwothread.setPriority(1);
        taskTwothread.start();
    }
}
//Normal priority is 5 - NORM_PRIORITY
//High priority is 10 - MAX_PRIORITY
//Low priority is 1 - MIN_PRIORITY
//Priority is not a guarantee - it is a request to the scheduler
//Request might be honored or might not be honored
//Priority is just a hint to the scheduler