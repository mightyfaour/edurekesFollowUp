package org.example.TestingPack.LearningTest.dao;

public class JavaCourse implements Course{
    @Override
    public boolean coursePurchased() {
        System.out.println("Java Course purchased");
        return true;
    }
}
