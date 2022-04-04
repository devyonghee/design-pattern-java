package me.devyonghee.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu implements MenuComponent {

    private static final String NAME_DELIMITER = " : ";

    private final String name;

    private final List<MenuComponent> components = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
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
    public String name() {
        return String.join(NAME_DELIMITER, this.name, componentsName());
    }

    @Override
    public BigDecimal price() {
        return components.stream()
                .map(MenuComponent::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private String componentsName() {
        return components.stream()
                .map(MenuComponent::name)
                .collect(Collectors.joining("+"));
    }
}
