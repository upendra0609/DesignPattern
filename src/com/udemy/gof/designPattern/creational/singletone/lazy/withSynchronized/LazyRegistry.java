package com.udemy.designPattern.creational.singletone.lazy.withSynchronized;

import java.io.Serializable;

public class LazyRegistry implements Serializable, Cloneable {

    private static volatile LazyRegistry INSTANCE;

    private LazyRegistry() {

    }

    public static LazyRegistry getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyRegistry.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistry();
                }
            }
        }
        return INSTANCE;
    }

    //to overcome from serializable - de-serializable problem
    public Object readResolve() {
        return INSTANCE;
    }


    //to stop cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("illegal action");
    }
}
