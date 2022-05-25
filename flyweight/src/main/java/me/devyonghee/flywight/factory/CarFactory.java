package me.devyonghee.flywight.factory;

import java.util.HashMap;
import java.util.Map;

public final class CarFactory {

    private static final Map<String, Car> FLYWEIGHT = new HashMap<>();

    private CarFactory() {
    }

    public static Vehicle getCar(String name) {
        return FLYWEIGHT.computeIfAbsent(name, Car::new);
    }
}
