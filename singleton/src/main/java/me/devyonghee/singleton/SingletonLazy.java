package me.devyonghee.singleton;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy instance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething");
    }
}
