package me.devyonghee.visitor.visitor;

import me.devyonghee.visitor.element.Body;
import me.devyonghee.visitor.element.Car;
import me.devyonghee.visitor.element.Engine;
import me.devyonghee.visitor.element.Wheel;

public interface CarElementVisitor {

    String visit(Wheel wheel);

    String visit(Engine engine);

    String visit(Body body);

    String visit(Car car);
}
