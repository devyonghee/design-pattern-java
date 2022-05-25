package me.devyonghee.flywight.factory;

public final class Bike implements Vehicle {

    private static final String NAME_SUFFIX = " 자전거";
    private final String name;

    public Bike(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name + NAME_SUFFIX;
    }
}
