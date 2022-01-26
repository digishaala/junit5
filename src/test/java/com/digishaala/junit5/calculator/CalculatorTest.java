package com.digishaala.junit5.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("Test Addition of 2 Integers")
    void shouldTestIntegerAddition() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(1, 2);

        // Assert
        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("Test Division of 2 Integers")
    void shouldTestIntegerDivision() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.divide(10, 2);

        // Assert
        Assertions.assertEquals(5, result);
    }

    @Test
    @DisplayName("Test Division by 0 - Should Result in an Exception")
    void shouldThrowExceptionWhenDivisibleBy0() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        // Assert
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by 0 is not allowed");
    }
}