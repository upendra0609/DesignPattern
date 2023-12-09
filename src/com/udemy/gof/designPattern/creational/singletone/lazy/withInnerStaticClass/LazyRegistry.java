package com.udemy.designPattern.creational.singletone.lazy.withInnerStaticClass;

public class LazyRegistry {

    private LazyRegistry() {

    }

    /* as this is static class this will load only once even in case of multi threading
        this is private class can be called from outer class only not from outside of LazyRegistry class

     */
    private static final class RegistryHolder {
        static LazyRegistry INSTANCE = new LazyRegistry();
    }

    public static LazyRegistry getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
