package me.devyonghee.state;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("뽑기 기계 상태 패턴")
class GumballMachineTest {

    @Test
    @DisplayName("뽑기 기계 상태 패턴 테스트")
    void turnCrank() {
        //given
        GumballMachine gumballMachine = new GumballMachine(1);
        //when
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        //then
        assertThat(gumballMachine.isEmpty()).isTrue();
    }
}
