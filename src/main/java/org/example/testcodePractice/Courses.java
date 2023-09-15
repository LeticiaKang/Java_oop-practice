package org.example.testcodePractice;

import org.example.Course;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multipliedCreditAndCourseGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for(Course course: courses){
//            multipliedCreditAndCourseGrade += (course.getCredit() * course.getGradeToNumber());
            // get을 가져와서 정보를 찾아오는 것이 아닌, 해당 메서드를 구현해서 값을 가져오면 좀 더 유연한 코드를 작성할 수 있다.
            //위에 코드보다 더 객체지향적
            multipliedCreditAndCourseGrade += course.MultipliedCreditAndGrade();
        }
        return multipliedCreditAndCourseGrade;
    }

    public int calculateTotalCompletedCredit() {
        int totalCompletedCredit = courses.stream()
                .mapToInt(Course:: getCredit)
                .sum();
        return totalCompletedCredit;
    }
}
