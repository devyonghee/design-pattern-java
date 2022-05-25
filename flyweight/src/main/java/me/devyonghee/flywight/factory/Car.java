package me.devyonghee.flywight.factory;

public class Car implements Vehicle {

    private static final String NAME_SUFFIX = " 자동차";
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name + NAME_SUFFIX;
    }
}
