package me.devyonghee.flywight;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("flyweight 활용 예시")
class FlyweightTest {

    @Test
    @DisplayName("같은 문자열은 같은 객체")
    void string() {
        String abc1 = "abc";
        String abc2 = "abc";
        assertThat(abc1).isSameAs(abc2);
    }

    @Test
    @DisplayName("생성자를 이용한 문자열은 다른 객체")
    void string_constructor() {
        String abc1 = new String("abc");
        String abc2 = new String("abc");
        assertThat(abc1).isNotSameAs(abc2);
    }

    @Test
    @DisplayName("래퍼 클래스의 정적 팩토리 메소드로 생성하면 같은 객체")
    void integer_valueOf() {
        Integer one1 = Integer.valueOf("1");
        Integer one2 = Integer.valueOf("1");
        assertThat(one1).isSameAs(one2);
    }
}
