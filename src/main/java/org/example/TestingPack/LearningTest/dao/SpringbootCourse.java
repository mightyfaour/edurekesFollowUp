package org.example.TestingPack.LearningTest.dao;

public class SpringbootCourse implements Course{
    @Override
    public boolean coursePurchased() {
        System.out.println("Spring Boot Course Purchased");
        return true;
    }
}
