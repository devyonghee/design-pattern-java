package me.devyonghee.state;

class SoldOutState implements State {

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
        System.out.println("");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
