package me.devyonghee.visitor.visitor;

import me.devyonghee.visitor.element.Body;
import me.devyonghee.visitor.element.Car;
import me.devyonghee.visitor.element.Engine;
import me.devyonghee.visitor.element.Wheel;

public class CarElementPrintVisitor implements CarElementVisitor {

    @Override
    public String visit(Wheel wheel) {
        return wheel.name() + " 바퀴입니다.";
    }

    @Override
    public String visit(Engine engine) {
        return engine.name() + " 엔진입니다.";

    }

    @Override
    public String visit(Body body) {
        return body.name() + " 몸체입니다.";
    }

    @Override
    public String visit(Car car) {
        return car.name() + " 자동차입니다.";
    }
}
