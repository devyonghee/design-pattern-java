package me.devyonghee.flywight.staticfactorymethod;

import java.util.HashMap;
import java.util.Map;

public final class Car {

    private static final Map<String, Car> FLYWEIGHT = new HashMap<>();

    private static final String NAME_SUFFIX = " 자동차";
    private final String name;

    private Car(String name) {
        this.name = name;
    }

    public static Car from(String name) {
        return FLYWEIGHT.computeIfAbsent(name, Car::new);
    }

    public String name() {
        return name + NAME_SUFFIX;
    }
}
