package me.devyonghee.state;

class NoCoinState implements State {

    @Override
    public void insertCoin() {
        System.out.println("inserted a quarter");
    }

    @Override
    public void ejectCoin() {
        System.out.println("insert a coin first");

    }

    @Override
    public void turnCrank() {
        System.out.println("there is no coin");
    }

    @Override
    public void dispense() {
        System.out.println("please insert a coin");
    }
}
