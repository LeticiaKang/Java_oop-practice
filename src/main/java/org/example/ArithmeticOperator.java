package org.example;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADDITION("+") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    }, SUBSTRACTION("-") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    }, MUTILPLICATION("*") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    }, DIVISION("/") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithmeticOperator(String operator){
        this.operator = operator;
    }

    // 추상 메서드
    public abstract int arithmeticCalculate(final int operand1, final int operand2);

    // 외부에 노출되는 퍼블릭 인터페이스
    public static int calculate(int operand1, String operator, int operand2) {
        // 지역변수 선언
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                // operator와 같은 연산자를 찾기
                // enum값의 operator(위에서 말한 "+, -, *, /")가 Input받은 operator와 같다면
                .filter(v -> v.operator.equals((operator)))
                // 찾은 것 중 첫 번째를 리턴
                .findFirst()
                // 찾는게 없으면 오류 문구 발생
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다"));
        // 해당 지역변수로 메서드 호출 -> 위에서 조건과 일치하는 메서드를 호출하는 것임
        return arithmeticOperator.arithmeticCalculate(operand1, operand2);

    }
}