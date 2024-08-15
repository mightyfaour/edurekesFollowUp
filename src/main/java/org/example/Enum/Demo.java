package org.example.Enum;

public class Demo {
    public static void main(String[] args) {
        Status s = Status.Pending;

        if (s == Status.Running) {
            System.out.println("All good");
        }
        else if (s == Status.Pending) {
            System.out.println("Please wait");
        }
        else if (s == Status.Failed) {
            System.out.println("Try again");
        }
        else if (s == Status.Success) {
            System.out.println("Success");
        }
        else System.out.println("Done");

//        switch
        switch (s) {
            case Pending:
                System.out.println("Please wait");
                break;
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            default:
                System.out.println("Done");
                break;

        }
    }
}
