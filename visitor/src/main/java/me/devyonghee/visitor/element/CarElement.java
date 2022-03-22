package me.devyonghee.visitor.element;

import me.devyonghee.visitor.visitor.CarElementVisitor;

public interface CarElement {

    String accept(CarElementVisitor visitor);

}
