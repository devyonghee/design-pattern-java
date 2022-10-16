package me.devyonghee.state;

class GumballMachine {

    private final State soldOutState = new SoldOutState(this);
    private final State noCoinState = new NoCoinState(this);
    private final State hasCoinState = new HasCoinState(this);
    private final State soldState = new SoldState(this);
    private final State winnerState = new WinnerState(this);

    private int ballsCount;
    private State state = soldOutState;

    GumballMachine(int ballsCount) {
        this.ballsCount = ballsCount;
        if (isNotEmpty()) {
            state = noCoinState;
        }
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("a gumball comes rolling out the slot");
        if (isNotEmpty()) {
            ballsCount = ballsCount - 1;
        }
    }

    public void refill(int ballsCount) {
        this.ballsCount += ballsCount;
        System.out.println("The gumball machine was just refilled; its new count is: " + this.ballsCount);
        state.refill();
    }

    public void changeSoldState() {
        state = soldState;
    }

    void changeWinnerState() {
        state = winnerState;
    }

    void changeNoCoinState() {
        state = noCoinState;
    }

    void changeHasCoinState() {
        state = hasCoinState;
    }

    void changeSoldOutState() {
        state = soldOutState;
    }

    boolean isNotEmpty() {
        return !isEmpty();
    }

    boolean isEmpty() {
        return ballsCount == 0;
    }

    boolean hasGreaterThan(int count) {
        return ballsCount > count;
    }
}
