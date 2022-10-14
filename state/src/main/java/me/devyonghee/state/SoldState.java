package me.devyonghee.state;

class SoldState implements State {

    private final GumballMachine gumBallMachine;

    SoldState(GumballMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectCoin() {
        System.out.println("already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("please turn the crank once");
    }

    @Override
    public void dispense() {
        gumBallMachine.releaseBall();
        if (gumBallMachine.count() > 0) {
            gumBallMachine.changeNoCoin();
            return;
        }
        System.out.println("Oops, out of gumballs");
        gumBallMachine.changeSoldOut();
    }
}
