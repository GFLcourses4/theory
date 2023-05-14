package com.vyrvykhvsot.singleton;

public class SingletonLazyInitialized {

    private static SingletonLazyInitialized instance;

    private SingletonLazyInitialized() {}

    public static SingletonLazyInitialized getInstance() {
        if (instance == null) {
            instance = new SingletonLazyInitialized();
        }
        return instance;
    }
}
