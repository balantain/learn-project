package org.learn.design.patterns.creational.singleton;

public class NonSynchronizedSingleton {
    private static NonSynchronizedSingleton instance;

    private NonSynchronizedSingleton() {

    }

    public static NonSynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new NonSynchronizedSingleton();
        }
        return instance;
    }
}
