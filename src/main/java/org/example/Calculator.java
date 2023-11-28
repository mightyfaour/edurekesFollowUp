package org.example;

public class Calculator {
    public int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        int result = cal1.add(10, 20);
        System.out.println(result);
    }
}
