package me.devyonghee.composite;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("메뉴 구성 복합체")
class MenuComponentTest {

    @Test
    @DisplayName("메뉴 이름")
    void name() {
        //given
        MenuItem pancake = new MenuItem("팬케이크", BigDecimal.TEN);
        MenuItem cake = new MenuItem("케이크", BigDecimal.TEN);
        MenuItem pie = new MenuItem("파이", BigDecimal.TEN);

        Menu dessert = new Menu("디저트");
        dessert.add(pancake);
        dessert.add(cake);
        dessert.add(pie);

        //when
        String menuName = dessert.name();

        //then
        assertThat(menuName).isEqualTo("디저트 : 팬케이크+케이크+파이");
    }

    @Test
    @DisplayName("메뉴 이름")
    void price() {
        //given
        MenuItem pancake = new MenuItem("팬케이크", BigDecimal.TEN);
        MenuItem cake = new MenuItem("케이크", BigDecimal.TEN);
        MenuItem pie = new MenuItem("파이", BigDecimal.TEN);

        Menu dessert = new Menu("디저트");
        dessert.add(pancake);
        dessert.add(cake);
        dessert.add(pie);

        //when
        BigDecimal price = dessert.price();

        //then
        assertThat(price).isEqualTo(BigDecimal.valueOf(30));
    }

}
