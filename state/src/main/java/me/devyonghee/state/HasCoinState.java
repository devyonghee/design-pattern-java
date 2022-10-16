package me.devyonghee.state;

import java.util.Random;

class HasCoinState implements State {

    private static final Random RANDOM_WINNER = new Random();
    private static final int MAX_RANDOM_BOUND = 10;
    private static final int WINNER_NUMBER = 0;
    private final GumballMachine gumballMachine;

    HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("there is already a coin");
    }

    @Override
    public void ejectCoin() {
        System.out.println("returned a coin");
        gumballMachine.changeNoCoinState();
    }

    @Override
    public void turnCrank() {
        System.out.println("turned...");
        if (RANDOM_WINNER.nextInt(MAX_RANDOM_BOUND) == WINNER_NUMBER && gumballMachine.hasGreaterThan(1)) {
            gumballMachine.changeWinnerState();
            return;
        }
        gumballMachine.changeSoldState();
    }

    @Override
    public void dispense() {
        System.out.println("a gumball comes rolling out the slot");
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "HasCoinState";
    }
}
