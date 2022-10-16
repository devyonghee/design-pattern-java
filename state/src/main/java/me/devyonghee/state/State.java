package me.devyonghee.state;

interface State {

    void insertCoin();

    void ejectCoin();

    void turnCrank();

    void dispense();

    void refill();
}
