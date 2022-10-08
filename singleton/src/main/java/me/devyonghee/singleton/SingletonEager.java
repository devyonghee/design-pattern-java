package me.devyonghee.singleton;

class SingletonEager {

    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager instance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("doSomething");
    }
}
