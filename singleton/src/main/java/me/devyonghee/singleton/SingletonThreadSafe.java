package me.devyonghee.singleton;

public class SingletonThreadSafe {

    private volatile static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe instance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething");
    }
}
