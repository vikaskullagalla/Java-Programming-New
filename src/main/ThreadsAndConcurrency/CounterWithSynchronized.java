package main.ThreadsAndConcurrency;

public class CounterWithSynchronized {
    private int i;
    private int j;
    //with synchronized keyword only one thread can access the method at a time
    //either incrementI or incrementJ can be executed at a time
    //it is not possible for two threads to execute incrementI and incrementJ at the same time - this is called thread confinement
    //this is called mutual exclusion
    //this is called thread safety
    //this is called synchronization
    //this have impact on performance
    //to solve this we can use two separate locks for i and j - See code CounterWithReentrantLocks classs
    synchronized public void incrementI(){
        i++;
    }
    synchronized public void incrementJ(){
        j++;
    }
    public int getI(){
        return i;
    }
    public int getJ(){
        return j;
    }
}
class CounterWithSynchronizedRunner{
    public static void main(String[] args){
        CounterWithSynchronized counter = new CounterWithSynchronized();
        counter.incrementI();
        counter.incrementJ();
        System.out.println("i = " + counter.getI());
        System.out.println("j = " + counter.getJ());
    }
}
