package me.devyonghee.chainofresponsibility;

public abstract class Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(String request) {
        if (canNotHandle(request)) {
            validateExistNext();
            next.handle(request);
            return;
        }
        doHandle(request);
    }

    protected abstract boolean canNotHandle(String request);

    protected abstract void doHandle(String request);

    private void validateExistNext() {
        if (next == null) {
            throw new IllegalStateException("next handler is not exists");
        }
    }
}
