package app.Modules;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    Calculator calculatorTests;
    double num1;
    double num2;

    @BeforeEach
    void setUp() {
        num1 = 5;
        num2 = 10;
        calculatorTests = new Calculator(num1, num2);

    }

    @AfterEach
    void tearDown() {
        calculatorTests = null;
    }

    @Test
    void add() {
        double result = 15;
        assertEquals(result, calculatorTests.add());
    }

    @Test
    void subtract() {
        assertEquals(num1 - num2, calculatorTests.subtract());
    }

    @Test
    void multiply() {
        Calculator multiplyTests = new Calculator(176, 167);
        assertEquals(176 * 167, multiplyTests.multiply());
    }

    @Test
    void divide() {
        Calculator divideTests = new Calculator(6, 2);
        assertEquals(6 / 2,  divideTests.divide());
    }
}