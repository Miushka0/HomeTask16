package app;

import app.Modules.Calculator;
import app.Modules.UserInput;

public class HomeTask16 {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        double num1 = userInput.getFirstNumber();
        double num2 = userInput.getSecondNumber();
        char operator = userInput.getOperation();

        Calculator calculator = new Calculator(num1, num2);

        double result;
        switch (operator) {
            case '+':
                result = calculator.add();
                System.out.printf("Результат: %.2f%n", result);
                break;
            case '-':
                result = calculator.subtract();
                System.out.printf("Результат: %.2f%n", result);
                break;
            case '*':
                result = calculator.multiply();
                System.out.printf("Результат: %.2f%n", result);
                break;
            case '/':
                result = calculator.divide();
                System.out.printf("Результат: %.2f%n", result);
                break;
            default:
                System.out.println("Невірний оператор.");
        }

        userInput.close();
    }

}
