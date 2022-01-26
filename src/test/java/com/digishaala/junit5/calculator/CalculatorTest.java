package com.digishaala.junit5.calculator;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    @DisplayName("Test Integer Addition")
    void shouldTestIntegerAddition() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(1, 2);

        // Assert
        assertEquals(3, result);
    }
}