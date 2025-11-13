package main.ThreadsAndConcurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicsClasses {
    private AtomicInteger i = new AtomicInteger();
    private  AtomicInteger j = new AtomicInteger();

    public void incrementI(){
        i.incrementAndGet();
    }

    public void incrementJ(){
        j.incrementAndGet();
    }

    public int getI(){
        return i.get();
    }

    public int getJ(){
        return j.get();
    }
}

class AtomicsClassesRunner{
    public static void main(String[] args){
        AtomicsClasses counter = new AtomicsClasses();
        counter.incrementI();
        counter.incrementJ();
        System.out.println("i = " + counter.getI());
        System.out.println("j = " + counter.getJ());
    }
}

//solid principles 100%
//streams api, grouping
//        aws
//memory leakage
//        kafka, mq
//immutable class
//biconsumer
//functiona; interface creation
//without @FunctionalInterface
//github
//mergce cnflicts
//        jpa/hibernate
//multithreadded functions
//        spring security - starter dependencies
//        ecs elk ec2, kafka, s3
//
