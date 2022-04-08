package me.devyonghee.composite;

import java.math.BigDecimal;

public class MenuItem implements MenuComponent {

    private final BigDecimal price;

    public MenuItem(BigDecimal price) {
        this.price = price;
    }

    @Override
    public BigDecimal price() {
        return price;
    }
}
