package me.devyonghee.chainofresponsibility;

public class ConcreteHandler1 extends Handler {

    @Override
    protected boolean canNotHandle(String request) {
        return !"concrete1".equals(request);
    }

    @Override
    protected void doHandle(String request) {
        System.out.println("ConcreteHandler1 print " + request);
    }
}
