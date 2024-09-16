package org.example.Collections.List1.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStrings {
static  void BubbleSort(int arr[]){
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }
        }
    }
}
    public static void main(String[] args) {
        // Creating an array of characters
        char[] source = {'H', 'A', 'P', 'P', 'Y', 'L', 'E', 'A', 'R', 'N', 'I', 'N', 'G'};

//        source.

        List<String> names = new ArrayList<>();
        names.add("Phil");
        names.add("Emeka");
        names.add("Lilian");
        names.add("Pelumi");
        names.add("Oyindamola");

//        BubbleSort();
        System.out.println("Unsorted arraylist: "+names);
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted arraylist (ascending order): "+names);
        names.sort(Comparator.reverseOrder());
        System.out.println("Sorted arraylist (Reverse order): "+names);
    }

}
