package com.udemy.designPattern.creational.singletone.lazy.withSynchronized;

public class LazyRegistry {

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
}
