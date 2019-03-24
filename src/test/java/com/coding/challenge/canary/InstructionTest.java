package com.coding.challenge.canary;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class InstructionTest {

    @Test
    public void testReverseOneOperandInstruction() throws CalculatorException {




    }

    @Test
    public void testReverseTwoOperandInstruction() throws CalculatorException {

        Operator mockOperator = Mockito.mock(Operator.class);


        assertEquals( "1","1");
    }

    @Test(expected = CalculatorException.class)
    public void testInvalidOperandsNumber() throws CalculatorException {

    }
}