package org.example.timbChalka;

public class Factorial {

    public static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n-1);

    }
    public  int factorials(int n){
        if(n == 0) return 1;
        return n * factorials(n-1);
    }
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int result2 = fact.factorials(5);
        System.out.println(result2);
        int result1 = factorial(4);
        System.out.println("4 factorial = "+result1);
        System.out.println("5 factorial = "+factorial(5));
        System.out.println("10 factorial = "+factorial(10));

    }
}
