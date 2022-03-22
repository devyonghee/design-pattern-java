package me.devyonghee.visitor.visitor;

import me.devyonghee.visitor.element.Body;
import me.devyonghee.visitor.element.Car;
import me.devyonghee.visitor.element.Engine;
import me.devyonghee.visitor.element.Wheel;

public class CarElementDoVisitor implements CarElementVisitor {

    @Override
    public String visit(Wheel wheel) {
        return wheel.name() + " 바퀴를 굴립니다.";
    }

    @Override
    public String visit(Engine engine) {
        return engine.name() + " 엔진 시동을 겁니다.";

    }

    @Override
    public String visit(Body body) {
        return body.name() + " 몸체를 움직입니다.";
    }

    @Override
    public String visit(Car car) {
        return car.name() + " 자동차를 운전합니다.";
    }
}
