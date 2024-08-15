package org.example.timbChalka.Casting;

public class Casting_Demo {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num; // Auto-boxing
        System.out.println(num1);

        //int num2 = num1.intValue();
        int num2 = num; //Auto-unboxing
        System.out.println(num2); //unboxing

        Character ch = '1';
        int num3 = ch;
        System.out.println(num3 * 2);

        String str = "12";
        int num4 = Integer.parseInt(str);
        System.out.println(num4 * 2);

        double num5 = 2.5;
        int num6 = (int) num5; //Type Casting
        System.out.println(num6);
        double num7  = num6;
        System.out.println(num7);
    }
}
