package org.example.timbChalka;

public class CalcFeetAndInchesToCentimeters {

    public static void main(String[] args) {


    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) || ((inches >=0) && (inches < 12))){
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet, "+inches+"inches = "+centimeters+" cm");
        return centimeters;
    }


}
