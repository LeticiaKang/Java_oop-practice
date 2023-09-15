package org.example;

import org.example.testcodePractice.Courses;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;
    public GradeCalculator(List<Course> courses){
        this.courses = new Courses(courses);

    }
    public double calculateGreade() {
        // (학점수 + 교과목 평점) 합계
        double totalMultipliedCreditAndCourseGrade = courses.multipliedCreditAndCourseGrade();
        // 수강신청 총 학점 수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;

    }
}