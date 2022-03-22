package me.devyonghee.visitor;

import static org.assertj.core.api.Assertions.assertThat;

import me.devyonghee.visitor.element.Car;
import me.devyonghee.visitor.visitor.CarElementDoVisitor;
import me.devyonghee.visitor.visitor.CarElementPrintVisitor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("자동차 방문자 패턴")
class CarVisitorTest {

    @Test
    @DisplayName("자동차 동작")
    void doVisitor() {
        //given
        Car testCar = new Car("테스트");

        //when
        String result = testCar.accept(new CarElementDoVisitor());

        //then
        assertThat(result)
                .contains("테스트 자동차를 운전합니다.",
                        "왼쪽 바퀴를 굴립니다.",
                        "오른쪽 바퀴를 굴립니다.",
                        "고철 몸체를 움직입니다.",
                        "전기 엔진 시동을 겁니다."
                );
    }

    @Test
    @DisplayName("자동차 정보 출력")
    void printVisitor() {
        //given
        Car testCar = new Car("테스트");

        //when
        String result = testCar.accept(new CarElementPrintVisitor());

        //then
        assertThat(result)
                .contains("테스트 자동차입니다.",
                        "왼쪽 바퀴입니다.",
                        "오른쪽 바퀴입니다.",
                        "고철 몸체입니다.",
                        "전기 엔진입니다."
                );
    }

}
