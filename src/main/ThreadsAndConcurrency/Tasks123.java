package main.ThreadsAndConcurrency;

public class Tasks123 {
    public static void main(String[] args){
        //first task1 will be executed; then task2; then task3
        //each task will be executed one after the other
        //even though CPU is executing only task1, it will not execute other tasks because it doesn't know that other tasks are waiting to be executed
        //task1
        System.out.println("Task1 Kicked Off");
        System.out.print("Task1 started ");
        for(int i=101;i<=199;i++){
            System.out.print(i + " ");
        }
        System.out.print("Task1 completed ");
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
