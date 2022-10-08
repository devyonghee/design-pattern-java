package me.devyonghee.singleton;

public class SingletonBillPugh {

    private SingletonBillPugh() {
    }

    public static SingletonBillPugh instance() {
        return SingletonHolder.INSTANCE;
    }

    public void doSomething() {
        System.out.println("doSomething");
    }

    public static class SingletonHolder {

        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }
}
