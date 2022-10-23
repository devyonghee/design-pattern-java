package me.devyonghee.templatemethod;

import java.util.Optional;
import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    private static final Scanner scanner = new Scanner(System.in);

    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments() {
        return userInput().toLowerCase().startsWith("y");
    }

    private String userInput() {
        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
        return Optional.ofNullable(scanner.next())
                .orElse("no");
    }
}
