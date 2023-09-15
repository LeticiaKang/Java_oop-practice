package org.example;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Calculator {
    public static int calculate(int operand1, String operator, int operand2) {
        return ArithmeticOperator.calculate(operand1, operator, operand2);
    }

}
