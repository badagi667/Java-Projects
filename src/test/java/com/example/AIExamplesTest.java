package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AIExamplesTest {

    @Test
    public void testAddition() {
        assertEquals(5.0, AIExamples.calculate(2.0, '+', 3.0), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, AIExamples.calculate(3.0, '-', 2.0), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, AIExamples.calculate(2.0, '*', 3.0), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, AIExamples.calculate(6.0, '/', 3.0), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        AIExamples.calculate(6.0, '/', 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperation() {
        AIExamples.calculate(6.0, '%', 3.0);
    }
}