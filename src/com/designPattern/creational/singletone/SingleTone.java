package com.designPattern.creational.singletone;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class SingleTone implements Callable<SingleTone> {
//    private static String msg = null;
    private static SingleTone singleTone;
    private static final ReentrantLock l = new ReentrantLock();

    private SingleTone() {
    }

    @Override
    public SingleTone call() throws Exception {
        SingleTone s = getObj();
        System.out.println(s);
        return s;
    }

    public static SingleTone getObj() throws InterruptedException {
//        l.lock();
        Thread.sleep(1000);
        if (singleTone == null) {
            singleTone = new SingleTone();
        }
//        l.unlock();
        return singleTone;
    }
}

class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable[] jobs = {SingleTone::getObj,SingleTone::getObj,SingleTone::getObj,SingleTone::getObj,SingleTone::getObj,
                SingleTone::getObj,SingleTone::getObj,SingleTone::getObj,SingleTone::getObj,
                SingleTone::getObj,SingleTone::getObj,SingleTone::getObj,SingleTone::getObj,
                SingleTone::getObj,SingleTone::getObj,SingleTone::getObj,SingleTone::getObj};


        ExecutorService service = Executors.newFixedThreadPool(20);

        for (Callable c : jobs){
            Future<SingleTone> f = service.submit(c);
            System.out.println(f.get());
        }

        service.shutdown();
    }
}