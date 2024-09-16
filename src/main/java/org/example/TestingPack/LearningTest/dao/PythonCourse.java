package org.example.TestingPack.LearningTest.dao;

public class PythonCourse implements Course{
    @Override
    public boolean coursePurchased() {
        System.out.println("Python Course 'Not' purchased!");
        return false;
    }
}
