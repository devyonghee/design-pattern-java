package me.devyonghee.templatemethod;

import java.util.Optional;
import java.util.Scanner;

public class TeaWithHook extends CaffeineBeverageWithHook {

    private static final Scanner scanner = new Scanner(System.in);

    protected void brew() {
        System.out.println("Steeping the tea");
    }

    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public boolean customerWantsCondiments() {
        return userInput().toLowerCase().startsWith("y");
    }

    private String userInput() {
        System.out.print("Would you like lemon with your tea (y/n)?");
        return Optional.ofNullable(scanner.next())
                .orElse("no");
    }
}
