package me.devyonghee.composite;

import java.math.BigDecimal;

public class MenuItem implements MenuComponent {

    private final String name;
    private final BigDecimal price;

    public MenuItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public BigDecimal price() {
        return price;
    }
}
