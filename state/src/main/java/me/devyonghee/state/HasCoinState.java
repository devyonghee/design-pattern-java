package me.devyonghee.state;

class HasCoinState implements State {

    @Override
    public void insertCoin() {
        System.out.println("there is already a coin");
    }

    @Override
    public void ejectCoin() {
        System.out.println("returned a coin");
    }

    @Override
    public void turnCrank() {
        System.out.println("turned...");
    }

    @Override
    public void dispense() {
        System.out.println("a gumball comes rolling out the slot");
    }
}
