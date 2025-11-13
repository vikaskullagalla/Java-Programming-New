package main.ThreadsAndConcurrency;

public class ThreadUtilityMethods {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName()) - " + Thread.currentThread().getName());

        Thread.sleep(1000);
        System.out.println("Thread.sleep(1000); will make the current thread sleep for 1 second");

        //yield is a hint to the scheduler to yield the current thread; I am not doing anything urgent; I would like to give up on CPU, let other waiting threads run
        //yield is not a guarantee - it is a hint/request to the scheduler; this request might be honored or might not be honored
        Thread.yield();
        System.out.println("Thread.yield(); will make the current thread yield");

        Thread.interrupted();
        System.out.println("Thread.interrupted(); will return true if the current thread is interrupted");

        Thread.currentThread().interrupt();
        System.out.println("Thread.currentThread().interrupt(); will interrupt the current thread");

        Thread.currentThread().isInterrupted();
        System.out.println("Thread.currentThread().isInterrupted(); will return true if the current thread is interrupted");

    }
}
