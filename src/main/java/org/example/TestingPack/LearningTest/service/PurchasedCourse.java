package org.example.TestingPack.LearningTest.service;

import org.example.TestingPack.LearningTest.dao.Course;

public class PurchasedCourse {
    private Course course;
    public boolean proceedWithCourse(Course course) {
        return course.coursePurchased();
    }
}
