package me.devyonghee.singleton;

class SingletonStaticBlock {

    private static final SingletonStaticBlock INSTANCE;

    static {
        try {
            INSTANCE = new SingletonStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private SingletonStaticBlock() {
    }

    public static SingletonStaticBlock instance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("doSomething");
    }
}
