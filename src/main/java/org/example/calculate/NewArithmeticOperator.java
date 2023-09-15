package org.example.calculate;

public interface NewArithmeticOperator {

    boolean supports(String operator);
    int calculate(PositiveNumber operate1, PositiveNumber operate2);

}
