package org.example.Collections.List1.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingCompareMethod {
    public static void main(String[] args) {
// this is to compare the second digit of the integer
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else return -1;


            }
        };

        List<Integer> nums = new ArrayList<>();

        nums.add(49);
        nums.add(57);
        nums.add(91);
        nums.add(82);
        nums.add(13);

        System.out.println(nums);
        //to sort the array using their last digit
        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
