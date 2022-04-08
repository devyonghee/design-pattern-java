package me.devyonghee.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {

    private final BigDecimal defaultPrice;
    private final List<MenuComponent> components = new ArrayList<>();

    public Menu(BigDecimal defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public void add(MenuComponent component) {
        if (component == null) {
            throw new IllegalArgumentException("component to be added must not be null");
        }
        components.add(component);
    }

    public void remove(MenuComponent component) {
        if (component == null) {
            throw new IllegalArgumentException("component to be removed must not be null");
        }
        components.remove(component);
    }

    @Override
    public BigDecimal price() {
        return defaultPrice.add(componentsPrice());
    }

    private BigDecimal componentsPrice() {
        return components.stream()
                .map(MenuComponent::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
