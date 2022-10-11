package me.devyonghee.chainofresponsibility;

public class ConcreteHandler2 extends Handler {

    @Override
    protected boolean canNotHandle(String request) {
        return !"concrete2".equals(request);
    }

    @Override
    protected void doHandle(String request) {
        System.out.println("ConcreteHandler2 print " + request);
    }
}
