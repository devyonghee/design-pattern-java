package me.devyonghee.state;

class SoldOutState implements State {

    private final GumballMachine gumballMachine;

    SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("the machine is sold out");
    }

    @Override
    public void ejectCoin() {
        System.out.println("there is no coin to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }

    @Override
    public void refill() {
        gumballMachine.changeNoCoinState();
    }

    @Override
    public String toString() {
        return "SoldOutState";
    }
}
