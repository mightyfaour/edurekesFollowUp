package org.example.Collections.List1.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        String [] array = {"Python", "C++", "JAVA", "JavaScript"};
        System.out.print("Arrays : ");
        for (String items : array){
            System.out.print(items);
            System.out.print(" ");
        }
//        List<String> ass = Arrays.asList(array);
//        System.out.print("\nArray List : ");
//        ArrayList<String> languages = new ArrayList<>(ass);

//        or

        System.out.print("\nArray List : ");
        ArrayList<String> languages = new ArrayList<>(Arrays.asList(array));
        System.out.println(languages);
    }
}
