package me.devyonghee.flywight.staticfactorymethod;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("자동차")
class CarTest {

    @Test
    @DisplayName("정적 팩토리 메소드로 같은 이름의 자동차를 생성하면 같은 객체")
    void from() {
        //given
        String carName = "car";
        //when
        Car car1 = Car.from(carName);
        Car car2 = Car.from(carName);
        //then
        assertThat(car1).isSameAs(car2);
    }
}
