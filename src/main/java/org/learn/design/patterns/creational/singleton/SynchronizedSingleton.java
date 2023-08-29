package org.learn.design.patterns.creational.singleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;
    private static ThreadLocal<SynchronizedSingleton> threadLocal = new ThreadLocal<>();

    private SynchronizedSingleton() {

    }

    public static SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
            threadLocal.set(instance);
        }
        return threadLocal.get();
    }
}
