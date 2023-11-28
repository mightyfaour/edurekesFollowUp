package org.example.timbChalka;

public class SwitchStatement {
    public static void main(String[] args) {
        char switchedValue = 'D';

        switch (switchedValue){
            case 'A':
                System.out.println("A is selected");
                break;
            case 'B':
                System.out.println("B is selected");
                break;
            case 'C':
                System.out.println("C is selected");
                break;
            case 'D': case 'E': case 'F':
                System.out.println("neither A, B, C was selected but,");
                System.out.println(switchedValue+" was selected");
                break;

            default:
                System.out.println("Not among the options");
                break;
        }
    }
}
