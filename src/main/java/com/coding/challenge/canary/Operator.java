package com.coding.challenge.canary;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public enum Operator {

    ADDITION("+", "-", 2) {
        public Double calculate(Double firstOperand, Double secondOperand) throws CalculatorException {
            return secondOperand + firstOperand;
        }
    },

    SUBTRACTION("-", "+", 2) {
        public Double calculate(Double firstOperand, Double secondOperand) {
            return secondOperand - firstOperand;
        }
    },

    MULTIPLICATION("*", "/", 2) {
        public Double calculate(Double firstOperand, Double secondOperand) {
            return secondOperand * firstOperand;
        }
    },

    DIVISION("/", "*", 2) {
        public Double calculate(Double firstOperand, Double secondOperand) throws CalculatorException {
            if (firstOperand == 0)
                throw new CalculatorException("Cannot divide by 0.");
            return secondOperand / firstOperand;
        }
    },

    SQUAREROOT("sqrt", "pow", 1) {
        public Double calculate(Double firstOperand, Double secondOperand) {
            return sqrt(firstOperand);
        }
    },

    UNDO("undo", null, 0) {
        public Double calculate(Double firstOperand, Double secondOperand) throws CalculatorException {
            throw new CalculatorException("Invalid operation");
        }
    },

    CLEAR("clear", null, 0) {
        public Double calculate(Double firstOperand, Double secondOperand) throws CalculatorException {
            throw new CalculatorException("Invalid operation");
        }
    };
    // using map for a constant lookup cost
    Operator(String symbol, String opposite, int operandsNumber) {
    }
}