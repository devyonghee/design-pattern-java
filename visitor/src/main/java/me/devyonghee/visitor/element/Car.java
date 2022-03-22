package me.devyonghee.visitor.element;

import java.util.ArrayList;
import java.util.List;
import me.devyonghee.visitor.visitor.CarElementVisitor;

public class Car implements CarElement {

    private final String name;
    private final List<CarElement> elements = new ArrayList<>();

    public Car(String name) {
        this.name = name;
        elements.add(new Wheel("왼쪽"));
        elements.add(new Wheel("오른쪽"));
        elements.add(new Body("고철"));
        elements.add(new Engine("전기"));
    }

    public String name() {
        return name;
    }

    @Override
    public String accept(CarElementVisitor visitor) {
        StringBuilder sb = new StringBuilder();
        sb.append(visitor.visit(this));
        for (CarElement element : elements) {
            sb.append("\n");
            sb.append(element.accept(visitor));
        }
        return sb.toString();
    }
}
