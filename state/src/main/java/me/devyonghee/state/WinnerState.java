package me.devyonghee.state;

public class WinnerState implements State {

    private final GumballMachine gumballMachine;

    WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("already giving a Gumball");
    }

    @Override
    public void ejectCoin() {
        System.out.println("already giving a Gumball");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning again doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.isEmpty()) {
            gumballMachine.changeSoldOutState();
            return;
        }
        gumballMachine.releaseBall();
        System.out.println("YOU'RE A WINNER! You got two gumballs");
        if (gumballMachine.isEmpty()) {
            gumballMachine.changeNoCoinState();
            return;
        }
        System.out.println("Oops, out of gumballs!");
        gumballMachine.changeSoldOutState();
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "WinnerState";
    }
}
