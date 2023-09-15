package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

/**
     * 객체지향 설계 및 구현 방법으로 접근
     *
     * 요구사항
     * 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
     * MVC패턴(Model-View-Controller) 기반으로 구현한다
     * 일급 컬렉션 사용
     */
public class GradeCalculatorTest {
    // 학점계산기 도메인 : 이수과목, 학점계산기
    // 학점 계산기가 이수관목을 인스턴스로 가지면서 계산을 해야겠다
    // 이수과목 : 객체지향 프로그래밍, 자료구조, 중국어회화 (정적 객체들) --> 과목 클래스로 표현해서 추상화해야해
    // 평균학점을 계산하기 위해
    // 1)이수과목을 전달(to 학점계산기)         2) 학점계산기 - (학점수 x 교과목 평점)의 합계
    // 3) 과목에게 전달         4) 수강신청 총 학점 수         5)과목에게 전달

    @DisplayName("평균학점을 계산한다.")
    @Test
    void calculateGradeTest(){
        // 테스트할 과목이 여러개니까 List에 저장 = course
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        // GradeCalculator에 테스트할 객체 넘김
        GradeCalculator gradeCalculator = new GradeCalculator(courses);

        // GradeCalculator 객체인 gradeCalculator에 있는 메소드로 계산
        double gradeResult = gradeCalculator.calculateGreade();

        // 성적 결과 확인하기
        assertThat(gradeResult).isEqualTo(4.5);
    }
}
