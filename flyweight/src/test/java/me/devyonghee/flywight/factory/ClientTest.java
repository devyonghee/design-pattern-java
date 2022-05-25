package me.devyonghee.flywight.factory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("플라이 웨이트 패턴")
class ClientTest {

    @Test
    @DisplayName("팩토리에서 같은 이름으로 자동차를 가져오면 같은 객체")
    void car() {
        //given
        String carName = "car";
        //when
        Vehicle car1 = CarFactory.getCar(carName);
        Vehicle car2 = CarFactory.getCar(carName);
        //then
        assertThat(car1).isSameAs(car2);
    }

    @Test
    @DisplayName("같은 이름으로 자전거를 생성하면 다른 객체")
    void bike() {
        //given
        String bikeName = "bike";
        //when
        Vehicle bike1 = new Bike(bikeName);
        Vehicle bike2 = new Bike(bikeName);
        //then
        assertAll(
                () -> assertThat(bike1).isNotSameAs(bike2),
                () -> assertThat(bike1.name()).isEqualTo(bike2.name())
        );
    }
}
