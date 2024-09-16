package org.example.Collections.List1.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> language = new ArrayList<>();
        language.add("Java");
        language.add("Python");
        language.add("C++");
        language.add("JavaScript");
        System.out.println(language);

        String[] arry = new String[language.size()];

        language.toArray(arry);

        for (String items : arry) {
            System.out.println(items + ", ");
        }

        Collections.addAll(language, arry);
        System.out.println(language);
    }
}
