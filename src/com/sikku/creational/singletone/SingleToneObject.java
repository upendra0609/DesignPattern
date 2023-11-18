package com.sikku.creational.singletone;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class SingleToneObject {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Thread t1 = new Thread(Employee::getInstance);
//        Thread t2 = new Thread(Employee::getInstance);
//        Thread t3 = new Thread(Employee::getInstance);
//        Thread t4 = new Thread(Employee::getInstance);
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

        Callable[] jobs = {Employee::getInstance,Employee::getInstance,Employee::getInstance,
                Employee::getInstance,Employee::getInstance,
                Employee::getInstance};

        ExecutorService service = Executors.newFixedThreadPool(2);

        for (Callable c: jobs){
            Future<Employee> f = service.submit(c);
            System.out.println(f.get().hashCode());
        }

        service.shutdown();

        Employee e = Employee.getInstance();
        System.out.println("main " + e.hashCode());
    }

}

class Employee {

    private static final ReentrantLock l = new ReentrantLock(true);
    private static volatile Employee emp;

    private Employee() {

    }

    public static Employee getInstance() {
        if (l.tryLock()) {
            if (emp == null) {
                emp = new Employee();
            }
            l.unlock();
        }
        return emp;
    }
}
