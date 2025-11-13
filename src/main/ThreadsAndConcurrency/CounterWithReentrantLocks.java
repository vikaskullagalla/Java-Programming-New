package main.ThreadsAndConcurrency;

import java.util.concurrent.locks.ReentrantLock;

public class CounterWithReentrantLocks {
    private int i;
    private int j;
    //using ReentrantLock we can have multiple locks for different variables
    //this is called fine-grained locking
    //now two threads can execute incrementI and incrementJ at the same time
    private final ReentrantLock lockI = new ReentrantLock();
    private final ReentrantLock lockJ = new ReentrantLock();
    public void incrementI(){
        lockI.lock();//get lock for i
        i++;
        lockI.unlock();//release lock for i
    }
    public void incrementJ(){
        lockJ.lock();//get lock for i
        j++;
        lockJ.unlock();//release lock for i
    }
    public int getI(){
        return i;
    }
    public int getJ(){
        return j;
    }
}
class CounterWithSynchronizedRunner1 {
    public static void main(String[] args){
        CounterWithSynchronized counter = new CounterWithSynchronized();
        counter.incrementI();
        counter.incrementI();
        counter.incrementJ();
        System.out.println("i = " + counter.getI());
        System.out.println("j = " + counter.getJ());
    }
}
