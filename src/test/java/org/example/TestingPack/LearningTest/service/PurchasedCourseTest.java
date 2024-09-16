package org.example.TestingPack.LearningTest.service;

import org.example.TestingPack.LearningTest.dao.JavaCourse;
import org.example.TestingPack.LearningTest.dao.JunitCourse;
import org.example.TestingPack.LearningTest.dao.PythonCourse;
import org.example.TestingPack.LearningTest.dao.SpringbootCourse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PurchasedCourseTest {
    PurchasedCourse purchasedCourse = new PurchasedCourse();

    @Test
    void testPurchasedCourse_JunitCourse() {
        boolean status = purchasedCourse.proceedWithCourse(new JunitCourse());
        assertTrue(status);
    }

    @Test
    void testPurchasedCourse_javaCourse() {
        boolean status = purchasedCourse.proceedWithCourse(new JavaCourse());
        assertTrue(status);
    }

    @Test
    void testPurchasedCourse_SpringbootCourse() {
        boolean status = purchasedCourse.proceedWithCourse(new SpringbootCourse());
        assertTrue(status);

    }

    @Test
    void testPurchasedCourse_PythonCourse() {
        boolean status = purchasedCourse.proceedWithCourse(new PythonCourse());
        assertFalse(status, "It mail result in fail if the status is 'true'");
    }
  
}