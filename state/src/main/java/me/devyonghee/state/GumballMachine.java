package me.devyonghee.state;

public class GumballMachine {

    private final State soldOutState = new SoldOutState();
    private final State noCoinState = new NoCoinState();
    private final State hasCoinState = new HasCoinState();
    private final State soldState = new SoldState(this);

    private int ballsCount;
    private State state = soldOutState;

    public GumballMachine(int ballsCount) {
        this.ballsCount = ballsCount;
        if (ballsCount > 0) {
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
        if (ballsCount != 0) {
            ballsCount = ballsCount - 1;
        }
    }

    public int count() {
        return ballsCount;
    }

    public void changeNoCoin() {
        state = noCoinState;
    }

    public void changeSoldOut() {
        state = soldOutState;
    }
}
