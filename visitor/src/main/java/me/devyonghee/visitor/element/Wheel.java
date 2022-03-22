package me.devyonghee.visitor.element;

import me.devyonghee.visitor.visitor.CarElementVisitor;

public class Wheel implements CarElement {

    private final String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    @Override
    public String accept(CarElementVisitor visitor) {
        return visitor.visit(this);
    }
}
