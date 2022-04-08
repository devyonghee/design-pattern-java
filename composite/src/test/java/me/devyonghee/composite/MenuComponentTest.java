package me.devyonghee.composite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("메뉴 구성 복합체")
class MenuComponentTest {

    @Test
    @DisplayName("메뉴 가격")
    void price() {
        //given
        MenuItem oneDollarItem = new MenuItem(BigDecimal.ONE);
        MenuItem fiveDollarItem = new MenuItem(BigDecimal.valueOf(5));
        MenuItem tenDollarItem = new MenuItem(BigDecimal.TEN);

        Menu menu = new Menu(BigDecimal.ONE);
        menu.add(tenDollarItem);
        menu.add(oneDollarItem);
        menu.add(fiveDollarItem);
        //when, then
        assertThat(menu.price()).isEqualTo(BigDecimal.valueOf(17));
    }

}
