import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName, lastName;
        System.out.print("Enter your first name: ");
        firstName = scanner.next( );
        System.out.print("Enter your last name: ");
        lastName = scanner.next( );
        System.out.println("Your name is " + firstName +
                " " + lastName + ".");
        String fullname = firstName+" "+lastName;
        System.out.println(fullname);
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(800, 600);
        myWindow.setTitle(firstName+" "+ lastName);
        myWindow.setVisible(true);
        System.out.println(myWindow+" \nWhat's your name?");

        Date today = new Date();
        System.out.println(today);



//        String name;
//        Scanner scanner = new Scanner(System.in);
//
//        scanner.useDelimiter(System.getProperty("line.separator"));
//        System.out.print("Enter your full name (first, middle, last):");
//        name = scanner.next( );
//        System.out.println("Name entered: " + name);
    }
}
