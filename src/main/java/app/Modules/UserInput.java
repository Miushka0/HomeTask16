package app.Modules;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public double getFirstNumber() {
        System.out.print("Введіть перше число: ");
        return scanner.nextDouble();
    }

    public double getSecondNumber() {
        System.out.print("Введіть друге число: ");
        return scanner.nextDouble();
    }

    public char getOperation() {
        System.out.print("Виберіть операцію (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void close() {
        scanner.close();
    }
}
