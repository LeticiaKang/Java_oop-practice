package org.example.calculate;

import org.example.calculate.*;

import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Calculator {
    // NewArithmeticOperator 인터페이스를 하나 두고,
    // 인터페이스로 구현한 4개의 구현체를 받는다
    private static final List<NewArithmeticOperator> arithmeticOperators= List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return arithmeticOperators.stream()
                // 들어온 operator에 맞는 구현체를 찾고
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                // 해당 구현체 안에 calculate 메서드에 인자값을 넘김
                // int로 받기 때문에 map을 해줌
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다"));
    }

}
