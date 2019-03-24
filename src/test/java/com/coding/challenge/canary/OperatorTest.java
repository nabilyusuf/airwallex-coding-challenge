package com.coding.challenge.canary;

import org.junit.Test;

import java.util.Random;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.junit.Assert.assertEquals;

public class OperatorTest {

    @Test
    public void testCalculate() throws CalculatorException {
        Random r = new Random();
        double firstOperand = r.nextDouble();
        double secondOperand = r.nextDouble();

    }

    @Test(expected = CalculatorException.class)
    public void testDivideByZero() throws CalculatorException {

    }

    @Test(expected = CalculatorException.class)
    public void testInvalidOperations() throws CalculatorException {

    }
}